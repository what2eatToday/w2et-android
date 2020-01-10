package com.w2et.android.abs;
/*
 *  Date: 2020/1/9
 *  Author: chiyu.Shi
 *  Project: W2et
 *  Description:
 */

import android.content.Context;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;

import java.lang.reflect.ParameterizedType;

import butterknife.ButterKnife;

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView, NavigationCallback {

    private final String TAG = getClass().getSimpleName();
    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.getApp().addActivity(this);
        initPresenter();
    }

    private void initPresenter() {
        mPresenter = getT();
        if(mPresenter != null){
            mPresenter.attachView(this);
        }
    }

    private T getT() {
        try {
            return  ((Class<T>) ((ParameterizedType) (getClass().getGenericSuperclass())).getActualTypeArguments()[0]).newInstance();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        ButterKnife.bind(this);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        ButterKnife.bind(this);
    }

    @Override
    public void showInfo(String title,String content) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this).setTitle(title).setMessage(content).setCancelable(false);
        builder.show();
    }

    @Override
    public void showToast(String str) {
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }

    @Override
    public void showWaiting() {

    }

    @Override
    public void hideWaiting() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        App.getApp().removeActivity(this);
        if(mPresenter != null){
            mPresenter.detachView();
        }
    }
    @Override
    public BaseActivity getActivity() {
        return this;
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void onFound(Postcard postcard) {
    }

    @Override
    public void onLost(Postcard postcard) {
        showToast("你所打开的页面不存在或已删除");
    }

    @Override
    public void onArrival(Postcard postcard) {

    }

    @Override
    public void onInterrupt(Postcard postcard) {

    }
}
