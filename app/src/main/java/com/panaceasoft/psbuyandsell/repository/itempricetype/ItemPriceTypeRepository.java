package com.ecomexpert.nlo.repository.itempricetype;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

import com.ecomexpert.nlo.AppExecutors;
import com.ecomexpert.nlo.Config;
import com.ecomexpert.nlo.api.ApiResponse;
import com.ecomexpert.nlo.api.PSApiService;
import com.ecomexpert.nlo.db.ItemPriceTypeDao;
import com.ecomexpert.nlo.db.PSCoreDb;
import com.ecomexpert.nlo.repository.common.NetworkBoundResource;
import com.ecomexpert.nlo.repository.common.PSRepository;
import com.ecomexpert.nlo.utils.Utils;
import com.ecomexpert.nlo.viewobject.ItemPriceType;
import com.ecomexpert.nlo.viewobject.common.Resource;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ItemPriceTypeRepository extends PSRepository {
    private ItemPriceTypeDao itemPriceTypeDao;

    @Inject
    ItemPriceTypeRepository(PSApiService psApiService, AppExecutors appExecutors, PSCoreDb db, ItemPriceTypeDao itemPriceTypeDao) {

        super(psApiService, appExecutors, db);
        this.itemPriceTypeDao = itemPriceTypeDao;
    }

    public LiveData<Resource<List<ItemPriceType>>> getAllItemPriceTypeList(String limit, String offset) {

        return new NetworkBoundResource<List<ItemPriceType>, List<ItemPriceType>>(appExecutors) {

            @Override
            protected void saveCallResult(@NonNull List<ItemPriceType> itemTypeList) {
                Utils.psLog("SaveCallResult of getAllCategoriesWithUserId");

//                try {
//                    db.beginTransaction();
//
//                    itemPriceTypeDao.deleteAllItemPriceType();
//
//                    itemPriceTypeDao.insertAll(itemTypeList);
//
//                    db.setTransactionSuccessful();
//
//                } catch (Exception e) {
//                    Utils.psErrorLog("Error in doing transaction of getAllCategoriesWithUserId", e);
//                } finally {
//                    db.endTransaction();
//                }

                try {
                    db.runInTransaction(() -> {
                        itemPriceTypeDao.deleteAllItemPriceType();

                        itemPriceTypeDao.insertAll(itemTypeList);

                    });
                } catch (Exception ex) {
                    Utils.psErrorLog("Error at ", ex);
                }
            }


            @Override
            protected boolean shouldFetch(@Nullable List<ItemPriceType> data) {

                return connectivity.isConnected();
            }

            @NonNull
            @Override
            protected LiveData<List<ItemPriceType>> loadFromDb() {

                Utils.psLog("Load From Db (All Categories)");

                return itemPriceTypeDao.getAllItemPriceType();

            }

            @NonNull
            @Override
            protected LiveData<ApiResponse<List<ItemPriceType>>> createCall() {
                Utils.psLog("Call Get All Categories webservice.");

                return psApiService.getItemPriceTypeList(Config.API_KEY, limit, offset);
            }

            @Override
            protected void onFetchFailed(String message) {
                Utils.psLog("Fetch Failed of About Us");
            }

        }.asLiveData();
    }
}