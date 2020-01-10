package com.w2et.android.moudle.shop_manager.model;

import com.w2et.android.abs.App;
import com.w2et.android.greendao.entity.Shop;
import com.w2et.android.greendao.gen.ShopDao;
import com.w2et.android.moudle.shop_manager.contract.AddContract;

/*
 *   @author shichiyu
 *   @date   2020/1/10
 *   Email:  scy@shichiyu.cn
 *   Description:
 */
public class ShopModel implements AddContract.Model {
    private ShopDao shopDao = App.getApp().getDaoSession().getShopDao();
    @Override
    public String save(Shop shop) {
        try {
            shopDao.save(shop);
            return null;
        }catch (Exception e){
            return e.getMessage();
        }
    }


}
