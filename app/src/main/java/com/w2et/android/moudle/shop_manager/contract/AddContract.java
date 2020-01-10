package com.w2et.android.moudle.shop_manager.contract;

import com.w2et.android.abs.BasePresenter;
import com.w2et.android.abs.BaseView;
import com.w2et.android.greendao.entity.Shop;

/*
 *   @author shichiyu
 *   @date   2020/1/10
 *   Email:  scy@shichiyu.cn
 *   Description:
 */
public interface AddContract {
    interface View extends BaseView {

    }

    interface Model {
        String save(Shop shop);
    }

    abstract class Presenter extends BasePresenter<AddContract.View> {

        public abstract void go();
    }
}
