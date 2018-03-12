package com.example.anilreddy.advancedandroid.ui;

import android.view.animation.ScaleAnimation;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.Router;
import com.bluelinelabs.conductor.RouterTransaction;
import com.example.anilreddy.advancedandroid.di.ActivityScope;

import javax.inject.Inject;

/**
 * Created by anilreddy on 3/12/2018.
 */

@ActivityScope
public class DefaultScreenNavigator implements ScreenNavigator {

    public Router router;

    @Inject
    DefaultScreenNavigator() {

    }

    @Override
    public void initWithRouter(Router router, Controller rootScreen) {
        this.router = router;
        if (!router.hasRootController()) {
            router.setRoot(RouterTransaction.with(rootScreen));
        }
    }

    @Override
    public boolean pop() {
        return router != null && router.handleBack();
    }

    @Override
    public void clear() {
         router = null;
    }
}

