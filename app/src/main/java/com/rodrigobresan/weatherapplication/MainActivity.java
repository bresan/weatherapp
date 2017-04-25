package com.rodrigobresan.weatherapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

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

        someMethod(1);
    }

    private void someMethod(int variable) {
        switch (variable) {
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
        }
    }

}