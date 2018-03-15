package com.lindroid.languagedemo;

import android.app.Application;

import com.finddreams.languagelib.MultiLanguageUtil;

/**
 * @author Lin
 * @date 2018/3/15
 * @function
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiLanguageUtil.init(this);
    }
}
