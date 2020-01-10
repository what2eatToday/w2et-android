package com.w2et.android.model;
/*
 *  Date: 2020/1/10
 *  Author: chiyu.Shi
 *  Project: W2et
 *  Description:
 */

import com.w2et.android.greendao.model.Shop;

public class WeightNode {
    private int weight;
    private Shop shop;

    public WeightNode(Shop shop){
        this.shop = shop;
        this.weight = 5;
        //初始权重为5
    }
    public WeightNode(Shop shop,int value){
        this.shop = shop;
        this.weight = value;
        //初始权重为5
    }
    //按距离{ 3000,1000,500 },{ -3. -2. -1}

    //上一顿，上上一顿 { -5, -4 ,-3, -2, -1 }


    public int getWeight() {
        return weight;
    }

    public Shop getShop() {
        return shop;
    }
}
