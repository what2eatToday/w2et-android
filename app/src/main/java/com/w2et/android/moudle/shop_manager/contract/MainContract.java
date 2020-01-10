package com.w2et.android.moudle.shop_manager.contract;
/*
 *  Date: 2020/1/10
 *  Author: chiyu.Shi
 *  Project: W2et
 *  Description:
 */

import com.w2et.android.abs.BasePresenter;
import com.w2et.android.abs.BaseView;

public interface MainContract {

    interface View extends BaseView{

    }

    abstract class Presenter extends BasePresenter<View>{

        public abstract void go();
    }

}
