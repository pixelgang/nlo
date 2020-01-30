package com.ecomexpert.nlo.ui.forceupdate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

import androidx.databinding.DataBindingUtil;

import com.ecomexpert.nlo.Config;
import com.ecomexpert.nlo.R;
import com.ecomexpert.nlo.databinding.ActivityForceUpdateBinding;
import com.ecomexpert.nlo.ui.common.PSAppCompactActivity;
import com.ecomexpert.nlo.utils.Constants;
import com.ecomexpert.nlo.utils.MyContextWrapper;

public class ForceUpdateActivity extends PSAppCompactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityForceUpdateBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_force_update);

        // Init all UI
        initUI(binding);

    }

    private void initUI(ActivityForceUpdateBinding binding) {

        // Toolbar
//        initToolbar(binding.toolbar, getResources().getString(R.string.comment__title));

        setupFragment(new ForceUpdateFragment());
        // Or you can call like this
        //setupFragment(new NewsListFragment(), R.id.content_frame);

    }

    @Override
    protected void attachBaseContext(Context newBase) {

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(newBase);
        String CURRENT_LANG_CODE = preferences.getString(Constants.LANGUAGE_CODE, Config.DEFAULT_LANGUAGE);
        String CURRENT_LANG_COUNTRY_CODE = preferences.getString(Constants.LANGUAGE_COUNTRY_CODE, Config.DEFAULT_LANGUAGE_COUNTRY_CODE);

        super.attachBaseContext(MyContextWrapper.wrap(newBase, CURRENT_LANG_CODE, CURRENT_LANG_COUNTRY_CODE, true));
    }

    @Override
    public void onBackPressed() {

    }
}
