package com.w2et.android.abs;
/*
 *  Date: 2020/1/10
 *  Author: chiyu.Shi
 *  Project: W2et
 *  Description:
 */

import android.content.Context;

public interface BaseView {
    void showInfo(String title,String content);
    void showToast(String str);
    void showWaiting();
    void hideWaiting();

    BaseActivity getActivity();
    Context getContext();
}
