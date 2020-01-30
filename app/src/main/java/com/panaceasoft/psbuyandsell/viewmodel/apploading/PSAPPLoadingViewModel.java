package com.ecomexpert.nlo.viewmodel.apploading;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;

import com.ecomexpert.nlo.repository.apploading.AppLoadingRepository;
import com.ecomexpert.nlo.utils.AbsentLiveData;
import com.ecomexpert.nlo.utils.Utils;
import com.ecomexpert.nlo.viewmodel.common.PSViewModel;
import com.ecomexpert.nlo.viewobject.PSAppInfo;
import com.ecomexpert.nlo.viewobject.common.Resource;

import javax.inject.Inject;

public class PSAPPLoadingViewModel extends PSViewModel {

    private final LiveData<Resource<PSAppInfo>> deleteHistoryData;
    private MutableLiveData<TmpDataHolder> deleteHistoryObj = new MutableLiveData<>();
    public PSAppInfo psAppInfo;

    public String appSettingLat;
    public String appSettingLng;

    @Inject
    PSAPPLoadingViewModel(AppLoadingRepository repository) {
        deleteHistoryData = Transformations.switchMap(deleteHistoryObj, obj -> {
            if (obj == null) {
                return AbsentLiveData.create();
            }
            Utils.psLog("PSAppInfoViewModel");
            return repository.deleteTheSpecificObjects(obj.startDate, obj.endDate);
        });
    }

    public void setDeleteHistoryObj(String startDate, String endDate) {

        TmpDataHolder tmpDataHolder = new TmpDataHolder(startDate, endDate);

        this.deleteHistoryObj.setValue(tmpDataHolder);
    }

    public LiveData<Resource<PSAppInfo>> getDeleteHistoryData() {
        return deleteHistoryData;
    }

    class TmpDataHolder {
        String startDate, endDate;

        private TmpDataHolder(String startDate, String endDate) {
            this.startDate = startDate;
            this.endDate = endDate;
        }
    }

}

