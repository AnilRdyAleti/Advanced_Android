package com.example.anilreddy.advancedandroid.home;

import com.bluelinelabs.conductor.Controller;
import com.example.anilreddy.advancedandroid.R;
import com.example.anilreddy.advancedandroid.base.BaseActivity;
import com.example.anilreddy.advancedandroid.trending.TrendingReposController;

public class MainActivity extends BaseActivity {

    @Override
    protected int layoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected Controller initialScreen() {
        return new TrendingReposController();
    }
}
