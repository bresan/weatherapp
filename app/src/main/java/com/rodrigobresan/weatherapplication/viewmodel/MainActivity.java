package com.rodrigobresan.weatherapplication.viewmodel;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rodrigobresan.weatherapplication.R;
import com.rodrigobresan.weatherapplication.databinding.ActivityMainBinding;

/**
 * Created by rodrigobresan on 4/24/17.
 * <p>
 * E-mail: rcbresan@gmail.com
 * Github: bresan
 */

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}