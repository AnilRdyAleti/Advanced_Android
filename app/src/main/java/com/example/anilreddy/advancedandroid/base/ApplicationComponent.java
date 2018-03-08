package com.example.anilreddy.advancedandroid.base;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by anilreddy on 3/8/2018.
 */

@Singleton
@Component (modules = {ApplicationModule.class})
public interface ApplicationComponent {
}
