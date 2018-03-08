package com.example.anilreddy.advancedandroid.di;

import android.app.Activity;

/**
 * Created by anilreddy on 3/8/2018.
 */

public class Injector {

    private Injector() {
    }

    public static void Inject(Activity activity) {
        ActivityInjector.get(activity).inject(activity);
    }

    public static void clearComponent(Activity activity) {
        ActivityInjector.get(activity).clear(activity);
    }
}
