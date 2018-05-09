package com.example.anilreddy.advancedandroid.base;

import android.app.Application;

import com.example.anilreddy.advancedandroid.BuildConfig;
import com.example.anilreddy.advancedandroid.di.ActivityInjector;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by anilreddy on 3/8/2018.
 */

public class MyApplication extends Application {

    @Inject
    ActivityInjector activityInjector;

    protected ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = initComponent();
        component.inject(this);

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    protected ApplicationComponent initComponent() {
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ActivityInjector getActivityInjector() {
        return activityInjector;
    }
}
