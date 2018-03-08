package com.example.anilreddy.advancedandroid.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by anilreddy on 3/8/2018.
 */

@Module
public class ApplicationModule {

    private final Application application;

    ApplicationModule(Application application){
        this.application = application;
    }

    @Provides
    Context provideApplicationContext(){
        return application;
    }
}
