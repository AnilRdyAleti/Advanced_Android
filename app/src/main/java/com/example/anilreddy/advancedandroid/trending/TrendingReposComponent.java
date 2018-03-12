package com.example.anilreddy.advancedandroid.trending;

import com.example.anilreddy.advancedandroid.di.ScreenScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by anilreddy on 3/12/2018.
 */

@ScreenScope
@Subcomponent
public interface TrendingReposComponent extends AndroidInjector<TrendingReposController> {


    @Subcomponent.Builder
    abstract public class Builder extends AndroidInjector.Builder<TrendingReposController>{

    }
}
