package com.ecomexpert.nlo.ui.apploading;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.ecomexpert.nlo.Config;
import com.ecomexpert.nlo.R;
import com.ecomexpert.nlo.binding.FragmentDataBindingComponent;
import com.ecomexpert.nlo.databinding.FragmentAppLoadingBinding;
import com.ecomexpert.nlo.ui.common.PSFragment;
import com.ecomexpert.nlo.utils.AutoClearedValue;
import com.ecomexpert.nlo.utils.Constants;
import com.ecomexpert.nlo.utils.PSDialogMsg;
import com.ecomexpert.nlo.utils.Utils;
import com.ecomexpert.nlo.viewmodel.apploading.PSAPPLoadingViewModel;
import com.ecomexpert.nlo.viewmodel.clearalldata.ClearAllDataViewModel;
import com.ecomexpert.nlo.viewobject.PSAppInfo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class AppLoadingFragment extends PSFragment {


    //region Variables

    private final androidx.databinding.DataBindingComponent dataBindingComponent = new FragmentDataBindingComponent(this);

    private PSDialogMsg psDialogMsg;
    private String startDate = Constants.ZERO;
    private String endDate = Constants.ZERO;

    private PSAPPLoadingViewModel appLoadingViewModel;
    private ClearAllDataViewModel clearAllDataViewModel;

    //endregion Variables

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentAppLoadingBinding dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_app_loading, container, false, dataBindingComponent);
        AutoClearedValue<FragmentAppLoadingBinding> binding = new AutoClearedValue<>(this, dataBinding);

        return binding.get().getRoot();
    }


    @Override
    protected void initUIAndActions() {

        psDialogMsg = new PSDialogMsg(getActivity(), false);

//        if (force_update) {
//            navigationController.navigateToForceUpdateActivity(this.getActivity(), force_update_title, force_update_msg);
//        }
    }

    @Override
    protected void initViewModels() {
        appLoadingViewModel = ViewModelProviders.of(this, viewModelFactory).get(PSAPPLoadingViewModel.class);
        clearAllDataViewModel = ViewModelProviders.of(this, viewModelFactory).get(ClearAllDataViewModel.class);
    }

    @Override
    protected void initAdapters() {
    }

    @Override
    protected void initData() {

        if (connectivity.isConnected()) {
            if (startDate.equals(Constants.ZERO)) {

                startDate = getDateTime();
                Utils.setDatesToShared(startDate, endDate, pref);
            }

            endDate = getDateTime();
            appLoadingViewModel.setDeleteHistoryObj(startDate, endDate);

        } else {
            if (!selected_location_id.isEmpty()) {
                navigationController.navigateToMainActivity(getActivity(), selected_location_id, selected_location_name, selectedLat, selectedLng);

            } else {
                navigationController.navigateToLocationActivity(getActivity(), Constants.LOCATION_NOT_CLEAR_ICON, Constants.EMPTY_STRING);
            }

            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (getActivity() != null) {
                getActivity().finish();
            }
        }

        appLoadingViewModel.getDeleteHistoryData().observe(this, result -> {

            if (result != null) {
                switch (result.status) {

                    case SUCCESS:

                        if (result.data != null) {
                            appLoadingViewModel.psAppInfo = result.data;
                            checkVersionNumber(result.data);
                            startDate = endDate;
                        }
                        break;

                    case ERROR:

                        break;
                }
            }

        });

        clearAllDataViewModel.getDeleteAllDataData().observe(this, result -> {

            if (result != null) {
                switch (result.status) {

                    case ERROR:

                        break;

                    case SUCCESS:

                        checkForceUpdate(appLoadingViewModel.psAppInfo);
                        break;
                }
            }
        });

    }

    private void checkForceUpdate(PSAppInfo psAppInfo) {
        if (psAppInfo.psAppVersion.versionForceUpdate.equals(Constants.ONE)) {

            pref.edit().putString(Constants.APPINFO_PREF_VERSION_NO, psAppInfo.psAppVersion.versionNo).apply();
            pref.edit().putBoolean(Constants.APPINFO_PREF_FORCE_UPDATE, true).apply();
            pref.edit().putString(Constants.APPINFO_FORCE_UPDATE_TITLE, psAppInfo.psAppVersion.versionTitle).apply();
            pref.edit().putString(Constants.APPINFO_FORCE_UPDATE_MSG, psAppInfo.psAppVersion.versionMessage).apply();

            navigationController.navigateToForceUpdateActivity(this.getActivity(), psAppInfo.psAppVersion.versionTitle, psAppInfo.psAppVersion.versionMessage);
            if (getActivity() != null) {
                getActivity().finish();
            }
        } else if (psAppInfo.psAppVersion.versionForceUpdate.equals(Constants.ZERO)) {

            pref.edit().putBoolean(Constants.APPINFO_PREF_FORCE_UPDATE, false).apply();

            psDialogMsg.showAppInfoDialog(getString(R.string.update), getString(R.string.app__cancel), psAppInfo.psAppVersion.versionTitle, psAppInfo.psAppVersion.versionMessage);
            ShowDialog();
        }
    }

    private void checkVersionNumber(PSAppInfo psAppInfo) {
        if (!Config.APP_VERSION.equals(psAppInfo.psAppVersion.versionNo)) {

            if (psAppInfo.psAppVersion.versionNeedClearData.equals(Constants.ONE)) {
                psDialogMsg.cancel();
                clearAllDataViewModel.setDeleteAllDataObj();
            } else {
                checkForceUpdate(appLoadingViewModel.psAppInfo);
            }

        } else {
            pref.edit().putBoolean(Constants.APPINFO_PREF_FORCE_UPDATE, false).apply();
            if (!selected_location_id.isEmpty()) {
                navigationController.navigateToMainActivity(getActivity(), selected_location_id, selected_location_name, selectedLat, selectedLng);
            } else {
                navigationController.navigateToLocationActivity(getActivity(), Constants.LOCATION_NOT_CLEAR_ICON, Constants.EMPTY_STRING);
            }
            if (getActivity() != null) {
                getActivity().finish();
            }
        }

    }

    private void ShowDialog() {
        psDialogMsg.show();

        psDialogMsg.okButton.setOnClickListener(v -> {
            psDialogMsg.cancel();

            if (!selected_location_id.isEmpty()) {
                navigationController.navigateToMainActivity(getActivity(), selected_location_id, selected_location_name, selectedLat, selectedLng);
            } else {
                navigationController.navigateToLocationActivity(getActivity(), Constants.LOCATION_NOT_CLEAR_ICON, Constants.EMPTY_STRING);
            }


            if (getActivity() != null) {
                navigationController.navigateToPlayStore(AppLoadingFragment.this.getActivity());

                getActivity().finish();
            }

        });

        psDialogMsg.cancelButton.setOnClickListener(v -> {
            psDialogMsg.cancel();
            if (!selected_location_id.isEmpty()) {
                navigationController.navigateToMainActivity(getActivity(), selected_location_id, selected_location_name, selectedLat, selectedLng);
            } else {
                navigationController.navigateToLocationActivity(getActivity(), Constants.LOCATION_NOT_CLEAR_ICON, Constants.EMPTY_STRING);
            }
            if (getActivity() != null) {
                getActivity().finish();
            }
        });

        psDialogMsg.getDialog().setOnCancelListener(dialog -> {
            if (!selected_location_id.isEmpty()) {
                navigationController.navigateToMainActivity(getActivity(), selected_location_id, selected_location_name, selectedLat, selectedLng);
            } else {
                navigationController.navigateToLocationActivity(getActivity(), Constants.LOCATION_NOT_CLEAR_ICON, Constants.EMPTY_STRING);
            }
            if (getActivity() != null) {
                getActivity().finish();
            }
        });
    }


    private String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CANADA);
        Date date = new Date();
        return dateFormat.format(date);
    }


}
