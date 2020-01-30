package com.ecomexpert.nlo.ui.subcategory.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.databinding.DataBindingUtil;

import com.ecomexpert.nlo.R;
import com.ecomexpert.nlo.databinding.ItemSearchSubCategoryAdapterBinding;
import com.ecomexpert.nlo.ui.common.DataBoundListAdapter;
import com.ecomexpert.nlo.ui.common.DataBoundViewHolder;
import com.ecomexpert.nlo.utils.Objects;
import com.ecomexpert.nlo.viewobject.ItemSubCategory;

public class SearchSubCategoryAdapter extends DataBoundListAdapter<ItemSubCategory, ItemSearchSubCategoryAdapterBinding> {

    private final androidx.databinding.DataBindingComponent dataBindingComponent;
    private final SearchSubCategoryAdapter.NewsClickCallback callback;
    private DataBoundListAdapter.DiffUtilDispatchedInterface diffUtilDispatchedInterface = null;
    private int lastPosition = -1;
    private String subCatId;

    public SearchSubCategoryAdapter(androidx.databinding.DataBindingComponent dataBindingComponent,
                                    SearchSubCategoryAdapter.NewsClickCallback callback,
                                    DiffUtilDispatchedInterface diffUtilDispatchedInterface) {
        this.dataBindingComponent = dataBindingComponent;
        this.callback = callback;
        this.diffUtilDispatchedInterface = diffUtilDispatchedInterface;
    }

    public SearchSubCategoryAdapter(androidx.databinding.DataBindingComponent dataBindingComponent,
                                    SearchSubCategoryAdapter.NewsClickCallback callback, String subCatId) {
        this.dataBindingComponent = dataBindingComponent;
        this.callback = callback;
        this.subCatId = subCatId;
    }

    @Override
    protected ItemSearchSubCategoryAdapterBinding createBinding(ViewGroup parent) {
        ItemSearchSubCategoryAdapterBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.item_search_sub_category_adapter, parent, false,
                        dataBindingComponent);

        binding.getRoot().setOnClickListener(v -> {
            ItemSubCategory subCategory = binding.getSubCategory();
            if (subCategory != null && callback != null) {

                callback.onClick(subCategory);
            }
        });
        return binding;
    }

    @Override
    public void bindView(DataBoundViewHolder<ItemSearchSubCategoryAdapterBinding> holder, int position) {
        super.bindView(holder, position);

    }

    @Override
    protected void dispatched() {
        if (diffUtilDispatchedInterface != null) {
            diffUtilDispatchedInterface.onDispatched();
        }
    }

    @Override
    protected void bind(ItemSearchSubCategoryAdapterBinding binding, ItemSubCategory item) {
        binding.setSubCategory(item);

        if (subCatId != null) {
            if (item.id.equals(subCatId)) {
                binding.groupview.setBackgroundColor(binding.groupview.getResources().getColor((R.color.md_green_50)));
            }
        }

    }

    @Override
    protected boolean areItemsTheSame(ItemSubCategory oldItem, ItemSubCategory newItem) {
        return Objects.equals(oldItem.id, newItem.id);
    }

    @Override
    protected boolean areContentsTheSame(ItemSubCategory oldItem, ItemSubCategory newItem) {
        return Objects.equals(oldItem.id, newItem.id);
    }

    public interface NewsClickCallback {
        void onClick(ItemSubCategory subCategory);
    }

    private void setAnimation(View viewToAnimate, int position) {
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(viewToAnimate.getContext(), R.anim.slide_in_bottom);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        } else {
            lastPosition = position;
        }
    }
}
