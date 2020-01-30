package com.ecomexpert.nlo.viewmodel.item;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.ecomexpert.nlo.repository.item.ItemRepository;
import com.ecomexpert.nlo.utils.AbsentLiveData;
import com.ecomexpert.nlo.viewmodel.common.PSViewModel;
import com.ecomexpert.nlo.viewobject.Item;
import com.ecomexpert.nlo.viewobject.common.Resource;
import com.ecomexpert.nlo.viewobject.holder.ItemParameterHolder;

import java.util.List;

import javax.inject.Inject;

public class PopularItemViewModel extends PSViewModel {

    private final LiveData<Resource<List<Item>>> popularItemListByKeyData;
    private final MutableLiveData<PopularItemViewModel.ItemTmpDataHolder> itemListByKeyObj = new MutableLiveData<>();

    private final LiveData<Resource<Boolean>> nextPagepopularItemListByKeyData;
    private final MutableLiveData<PopularItemViewModel.ItemTmpDataHolder> nextPageItemListByKeyObj = new MutableLiveData<>();

    public ItemParameterHolder popularItemParameterHolder = new ItemParameterHolder().getPopularItem();

    @Inject
    PopularItemViewModel(ItemRepository repository)
    {

        popularItemListByKeyData = Transformations.switchMap(itemListByKeyObj, obj -> {

            if (obj == null) {
                return AbsentLiveData.create();
            }

            return repository.getItemListByKey(obj.loginUserId, obj.limit, obj.offset, obj.itemParameterHolder);

        });

        nextPagepopularItemListByKeyData = Transformations.switchMap(nextPageItemListByKeyObj, obj -> {

            if (obj == null) {
                return AbsentLiveData.create();
            }

            return repository.getNextPageProductListByKey(obj.itemParameterHolder, obj.loginUserId, obj.limit, obj.offset);

        });
    }

    //region getItemList

    public void setPopularItemListByKeyObj(String loginUserId, String limit, String offset, ItemParameterHolder parameterHolder) {

        PopularItemViewModel.ItemTmpDataHolder tmpDataHolder = new PopularItemViewModel.ItemTmpDataHolder(limit, offset, loginUserId, parameterHolder);

        this.itemListByKeyObj.setValue(tmpDataHolder);

    }

    public LiveData<Resource<List<Item>>> getPopularItemListByKeyData() {
        return popularItemListByKeyData;
    }

    public void setNextPagePopularItemListByKeyObj(String limit, String offset, String loginUserId, ItemParameterHolder parameterHolder) {

        PopularItemViewModel.ItemTmpDataHolder tmpDataHolder = new PopularItemViewModel.ItemTmpDataHolder(limit, offset, loginUserId, parameterHolder);

        this.nextPageItemListByKeyObj.setValue(tmpDataHolder);
    }

    public LiveData<Resource<Boolean>> getNextPagePopularItemListByKeyData() {
        return nextPagepopularItemListByKeyData;
    }

    //endregion

    class ItemTmpDataHolder {

        private String limit, offset, loginUserId;
        private ItemParameterHolder itemParameterHolder;

        public ItemTmpDataHolder(String limit, String offset, String loginUserId, ItemParameterHolder itemParameterHolder) {
            this.limit = limit;
            this.offset = offset;
            this.loginUserId = loginUserId;
            this.itemParameterHolder = itemParameterHolder;
        }
    }
}

