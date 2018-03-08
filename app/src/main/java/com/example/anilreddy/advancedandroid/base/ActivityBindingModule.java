package com.example.anilreddy.advancedandroid.base;

import android.app.Activity;

import com.example.anilreddy.advancedandroid.home.MainActivity;
import com.example.anilreddy.advancedandroid.home.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by anilreddy on 3/8/2018.
 */

@Module(subcomponents = {MainActivityComponent.class})
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);
}
