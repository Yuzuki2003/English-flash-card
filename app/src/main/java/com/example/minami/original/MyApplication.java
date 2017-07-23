package com.example.minami.original;

import android.os.Bundle;
import android.support.multidex.MultiDexApplication;

import com.orm.SugarApp;
import com.orm.SugarContext;

/**
 * Created by minami on 2017/04/06.
 */

public class MyApplication extends SugarApp {

    @Override
    public void onCreate() {
        super.onCreate();
        SugarContext.init(this);
    }
}
