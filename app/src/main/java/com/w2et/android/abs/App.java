package com.w2et.android.abs;
/*
 *  Date: 2020/1/9
 *  Author: chiyu.Shi
 *  Project: W2et
 *  Description:
 */

import android.app.Application;

import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.unit.Subunits;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AutoSizeConfig.getInstance().getUnitsManager()
                .setSupportDP(false)
                .setSupportSP(false)
                .setSupportSubunits(Subunits.PT);
    }
}
