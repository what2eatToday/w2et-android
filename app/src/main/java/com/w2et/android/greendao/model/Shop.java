package com.w2et.android.greendao.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/*
 *  Date: 2020/1/10
 *  Author: chiyu.Shi
 *  Project: W2et
 *  Description:
 */
@Entity
public class Shop {
    @Id(autoincrement = true)
    private Long _id;
    private String shop_name;
    @NotNull
    private String shop_location;

    private long lastTime2Go;


    @Generated(hash = 1341515409)
    public Shop(Long _id, String shop_name, @NotNull String shop_location,
            long lastTime2Go) {
        this._id = _id;
        this.shop_name = shop_name;
        this.shop_location = shop_location;
        this.lastTime2Go = lastTime2Go;
    }
    @Generated(hash = 633476670)
    public Shop() {
    }
    public Long get_id() {
        return this._id;
    }
    public void set_id(Long _id) {
        this._id = _id;
    }
    public String getShop_name() {
        return this.shop_name;
    }
    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }
    public String getShop_location() {
        return this.shop_location;
    }
    public void setShop_location(String shop_location) {
        this.shop_location = shop_location;
    }
    public long getLastTime2Go() {
        return this.lastTime2Go;
    }
    public void setLastTime2Go(long lastTime2Go) {
        this.lastTime2Go = lastTime2Go;
    }
}
