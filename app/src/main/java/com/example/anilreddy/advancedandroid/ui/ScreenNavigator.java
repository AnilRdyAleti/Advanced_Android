package com.example.anilreddy.advancedandroid.ui;

import com.bluelinelabs.conductor.Controller;
import com.bluelinelabs.conductor.Router;

/**
 * Created by anilreddy on 3/12/2018.
 */

public interface ScreenNavigator {

    void initWithRouter(Router router, Controller rootScreen);
    boolean pop();
    void clear();
}
