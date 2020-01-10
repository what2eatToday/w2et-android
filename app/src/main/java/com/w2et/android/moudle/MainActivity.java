package com.w2et.android.moudle;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.w2et.android.R;
import com.w2et.android.abs.App;
import com.w2et.android.abs.BaseActivity;
import com.w2et.android.abs.Constants;
import com.w2et.android.greendao.model.Shop;
import com.w2et.android.model.WeightNode;
import com.w2et.android.moudle.shop_manager.contract.MainContract;
import com.w2et.android.moudle.shop_manager.presenter.MainPresenter;
import com.w2et.android.utils.WeightRandom;

import org.w3c.dom.Node;

import java.util.LinkedList;

import butterknife.BindView;
import butterknife.OnClick;

@Route(path = Constants.Path.PATH_MAIN)
public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    @BindView(R.id.wtf)
    TextView textView;
    @BindView(R.id.btn_test)
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @OnClick(R.id.btn_test)
    public void test(){
        mPresenter.go();
    }

    @OnClick(R.id.btn_test2)
    public void test2(){
        App.getApp().exitApp();
    }
}
