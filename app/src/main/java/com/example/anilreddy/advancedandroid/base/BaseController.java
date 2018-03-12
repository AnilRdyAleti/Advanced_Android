package com.example.anilreddy.advancedandroid.base;

import android.content.Context;
import android.support.annotation.NonNull;

import com.bluelinelabs.conductor.Controller;
import com.example.anilreddy.advancedandroid.di.Injector;

/**
 * Created by anilreddy on 3/12/2018.
 */

public abstract class BaseController extends Controller {

    public boolean injected = false;

    @Override
    protected void onContextAvailable(@NonNull Context context) {
        if (!injected) {
            Injector.Inject(this);
            injected = true;
        }
        super.onContextAvailable(context);
    }
}
