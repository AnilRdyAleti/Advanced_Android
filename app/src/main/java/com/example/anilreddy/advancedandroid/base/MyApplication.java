package com.example.anilreddy.advancedandroid.base;

import android.app.Application;

/**
 * Created by anilreddy on 3/8/2018.
 */

public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
