package com.w2et.android.abs;
/*
 *  Date: 2020/1/9
 *  Author: chiyu.Shi
 *  Project: W2et
 *  Description:
 */

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

import java.util.HashSet;
import java.util.Set;

import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.unit.Subunits;

import static me.jessyan.autosize.utils.LogUtils.isDebug;

public class App extends Application {
    private static App app;
    public static App getApp(){
        return app;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        //自适应框架
        AutoSizeConfig.getInstance().getUnitsManager()
                .setSupportDP(false)
                .setSupportSP(false)
                .setSupportSubunits(Subunits.PT);
        //路由框架
        if (isDebug()) {           // These two lines must be written before init, otherwise these configurations will be invalid in the init process
            ARouter.openLog();     // Print log
            ARouter.openDebug();   // Turn on debugging mode (If you are running in InstantRun mode, you must turn on debug mode! Online version needs to be closed, otherwise there is a security risk)
        }
        ARouter.init(this);

    }

    private Set<BaseActivity> allActivities;
    public void addActivity(BaseActivity act) {
        if (allActivities == null) {
            allActivities = new HashSet<>();
        }
        allActivities.add(act);
    }
    public void removeActivity(BaseActivity act) {
        if (allActivities != null) {
            allActivities.remove(act);
        }
    }
    /**
     * 退出app
     */
    public void exitApp() {
        if (allActivities != null) {
            synchronized (allActivities) {
                for (BaseActivity act : allActivities) {
                    act.finish();
                }
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}
