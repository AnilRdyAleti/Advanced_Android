package com.example.anilreddy.advancedandroid.base;

import android.app.Activity;

import com.example.anilreddy.advancedandroid.di.ActivityInjector;

/**
 * Created by anilreddy on 3/8/2018.
 */

public class Injector {

    private Injector() {
    }

    static void Inject(Activity activity) {
        ActivityInjector.get(activity).inject(activity);
    }

    static void clearComponent(Activity activity) {
        ActivityInjector.get(activity).clear(activity);
    }
}
