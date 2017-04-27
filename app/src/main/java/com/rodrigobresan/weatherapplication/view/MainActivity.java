package com.rodrigobresan.weatherapplication.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rodrigobresan.weatherapplication.R;

/**
 * Created by rodrigobresan on 4/24/17.
 * <p>
 * E-mail: rcbresan@gmail.com
 * Github: bresan
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}