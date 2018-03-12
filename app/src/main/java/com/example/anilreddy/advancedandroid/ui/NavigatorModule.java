package com.example.anilreddy.advancedandroid.ui;

import dagger.Binds;
import dagger.Module;

/**
 * Created by anilreddy on 3/12/2018.
 */

@Module
public abstract class NavigatorModule {

    @Binds
    abstract ScreenNavigator provideScreenNavigator(DefaultScreenNavigator screenNavigator);
}
