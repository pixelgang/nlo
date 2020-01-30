package com.ecomexpert.nlo.ui.item.readmore;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.ecomexpert.nlo.R;
import com.ecomexpert.nlo.binding.FragmentDataBindingComponent;
import com.ecomexpert.nlo.databinding.FragmentReadMoreBinding;
import com.ecomexpert.nlo.ui.common.PSFragment;
import com.ecomexpert.nlo.utils.AutoClearedValue;
import com.ecomexpert.nlo.utils.Constants;
import com.ecomexpert.nlo.utils.Utils;
import com.ecomexpert.nlo.viewmodel.item.ItemViewModel;

public class ReadMoreFragment extends PSFragment {

    //region Variables
    private final androidx.databinding.DataBindingComponent dataBindingComponent = new FragmentDataBindingComponent(this);

    private ItemViewModel itemViewModel;

    @VisibleForTesting
    private AutoClearedValue<FragmentReadMoreBinding> binding;
    //endregion

    //region Override Methods
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        FragmentReadMoreBinding dataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_read_more, container, false, dataBindingComponent);
        binding = new AutoClearedValue<>(this, dataBinding);

        return binding.get().getRoot();
    }

    @Override
    protected void initUIAndActions() {

    }

    @Override
    protected void initViewModels() {
        itemViewModel = ViewModelProviders.of(this, viewModelFactory).get(ItemViewModel.class);
    }

    @Override
    protected void initAdapters() {

    }

    @Override
    protected void initData() {

        getIntentData();

        bindingData();

    }

    private void bindingData() {
        binding.get().termsAndConditionTextView.setText(itemViewModel.itemDescription);
    }

    private void getIntentData() {
        try {
            if (getActivity() != null) {
                if (getActivity().getIntent().getExtras() != null) {
                    itemViewModel.itemDescription = getActivity().getIntent().getExtras().getString(Constants.ITEM_DESCRIPTION);
                }
            }
        } catch (Exception e) {
            Utils.psErrorLog("", e);
        }
    }


}