package com.w2et.android.moudle;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.w2et.android.R;
import com.w2et.android.abs.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
