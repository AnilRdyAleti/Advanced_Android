package com.example.anilreddy.advancedandroid.ui;

import android.view.animation.ScaleAnimation;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.Router;
import com.example.anilreddy.advancedandroid.di.ActivityScope;

import javax.inject.Inject;

/**
 * Created by anilreddy on 3/12/2018.
 */

@ActivityScope
public class DefaultScreenNavigator implements ScreenNavigator {

    @Inject
    DefaultScreenNavigator(){

    }

    @Override
    public void initWithRouter(Router router, Controller rootScreen) {

    }

    @Override
    public boolean pop() {
        return false;
    }

    @Override
    public void clear() {

    }
}

