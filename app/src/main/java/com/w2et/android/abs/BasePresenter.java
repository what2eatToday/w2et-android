package com.w2et.android.abs;
/*
 *  Date: 2020/1/10
 *  Author: chiyu.Shi
 *  Project: W2et
 *  Description:
 */

public abstract class BasePresenter <T extends BaseView> {

    private T view;
    void attachView(T view){
        this.view = view;
    }

    void detachView(){
        this.view = null;
    }

    public T getView(){
        return view;
    }
}
