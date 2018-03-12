package com.example.anilreddy.advancedandroid.di;

import android.app.Activity;

import com.bluelinelabs.conductor.Controller;

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

    public static void Inject(Controller controller) {
        ScreenInjector.get(controller.getActivity()).inject(controller);
    }

    public static void clearComponent(Controller controller) {
        ScreenInjector.get(controller.getActivity()).inject(controller);

    }
}
