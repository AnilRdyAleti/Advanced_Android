package com.example.anilreddy.advancedandroid.base;

import android.app.Application;

import com.example.anilreddy.advancedandroid.di.ActivityInjector;

import javax.inject.Inject;

/**
 * Created by anilreddy on 3/8/2018.
 */

public class MyApplication extends Application {

    @Inject
    ActivityInjector activityInjector;

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ActivityInjector getActivityInjector() {
        return activityInjector;
    }
}
