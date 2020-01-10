package com.w2et.android.moudle.shop_manager.presenter;
/*
 *  Date: 2020/1/10
 *  Author: chiyu.Shi
 *  Project: W2et
 *  Description:
 */

import android.content.Intent;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.w2et.android.abs.Constants;
import com.w2et.android.moudle.MainActivity;
import com.w2et.android.moudle.shop_manager.contract.MainContract;

public class MainPresenter extends MainContract.Presenter {
    @Override
    public void go() {
        ARouter.getInstance().build("/path/aa").navigation(getView().getContext(), getView().getActivity());
    }
}
