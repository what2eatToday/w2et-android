package com.w2et.android.moudle.shop_manager.contract;

import com.w2et.android.abs.BasePresenter;
import com.w2et.android.abs.BaseView;

/*
 *   @author shichiyu
 *   @date   2020/1/10
 *   Email:  scy@shichiyu.cn
 *   Description:
 */
public interface UpdateContract {
    interface View extends BaseView {

    }

    abstract class Presenter extends BasePresenter<UpdateContract.View> {

        public abstract void go();
    }
}
