package com.ecomexpert.nlo.viewmodel.city;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.ecomexpert.nlo.repository.city.CityRepository;
import com.ecomexpert.nlo.utils.AbsentLiveData;
import com.ecomexpert.nlo.viewmodel.common.PSViewModel;
import com.ecomexpert.nlo.viewobject.City;
import com.ecomexpert.nlo.viewobject.common.Resource;
import com.ecomexpert.nlo.viewobject.holder.CityParameterHolder;

import java.util.List;

import javax.inject.Inject;

public class FeaturedCitiesViewModel extends PSViewModel {

    private final LiveData<Resource<List<City>>> featuredCityListData;
    private MutableLiveData<FeaturedCitiesViewModel.CityListTmpDataHolder> cityListObj = new MutableLiveData<>();

    private final LiveData<Resource<Boolean>> nextPagefeaturedCityListData;
    private MutableLiveData<FeaturedCitiesViewModel.CityListTmpDataHolder> nextPageCityListObj = new MutableLiveData<>();

    public CityParameterHolder featuredCitiesParameterHolder = new CityParameterHolder().getFeaturedCities();

    @Inject
    FeaturedCitiesViewModel(CityRepository repository) {

        //region Getting City List

        featuredCityListData = Transformations.switchMap(cityListObj, obj -> {

            if (obj == null) {
                return AbsentLiveData.create();
            }

            return repository.getCityListByValue(obj.limit, obj.offset, obj.parameterHolder);

        });

        nextPagefeaturedCityListData = Transformations.switchMap(nextPageCityListObj, obj -> {

            if (obj == null) {
                return AbsentLiveData.create();
            }

            return repository.getNextPageCityList(obj.limit, obj.offset, obj.parameterHolder);

        });

        //endregion

    }


    //region Getting City List

    public void setFeaturedCityListObj(String limit, String offset, CityParameterHolder parameterHolder) {
        FeaturedCitiesViewModel.CityListTmpDataHolder tmpDataHolder = new FeaturedCitiesViewModel.CityListTmpDataHolder(limit, offset, parameterHolder);

        this.cityListObj.setValue(tmpDataHolder);
    }

    public LiveData<Resource<List<City>>> getFeaturedCityListData() {
        return featuredCityListData;
    }

    public void setNextPageFeaturedCityListObj(String limit, String offset, CityParameterHolder parameterHolder) {
        FeaturedCitiesViewModel.CityListTmpDataHolder tmpDataHolder = new FeaturedCitiesViewModel.CityListTmpDataHolder(limit, offset, parameterHolder);

        this.nextPageCityListObj.setValue(tmpDataHolder);
    }

    public LiveData<Resource<Boolean>> getNextPageFeaturedCityListData() {
        return nextPagefeaturedCityListData;
    }

    //endregion


    class CityListTmpDataHolder {

        private String limit, offset;
        private CityParameterHolder parameterHolder;

        public CityListTmpDataHolder(String limit, String offset, CityParameterHolder parameterHolder) {
            this.limit = limit;
            this.offset = offset;
            this.parameterHolder = parameterHolder;
        }
    }
}
