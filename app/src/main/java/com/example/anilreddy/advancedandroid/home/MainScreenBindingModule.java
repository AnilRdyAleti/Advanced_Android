package com.example.anilreddy.advancedandroid.home;

import com.bluelinelabs.conductor.Controller;
import com.example.anilreddy.advancedandroid.di.ControllerKey;
import com.example.anilreddy.advancedandroid.trending.TrendingReposComponent;
import com.example.anilreddy.advancedandroid.trending.TrendingReposController;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by anilreddy on 3/12/2018.
 */

@Module(subcomponents = {TrendingReposComponent.class})
public abstract class MainScreenBindingModule {

    @Binds
    @IntoMap
    @ControllerKey(TrendingReposController.class)
    abstract AndroidInjector.Factory<? extends Controller> bindTrendingReposInjector(TrendingReposComponent.Builder builder);
}
