package com.example.anilreddy.advancedandroid.home;

import com.example.anilreddy.advancedandroid.di.ActivityScope;
import com.example.anilreddy.advancedandroid.ui.NavigatorModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by anilreddy on 3/8/2018.
 */
@ActivityScope
@Subcomponent(modules = {MainScreenBindingModule.class, NavigatorModule.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{

    }
}
