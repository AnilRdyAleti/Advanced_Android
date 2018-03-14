package com.example.anilreddy.advancedandroid.base;

import com.example.anilreddy.advancedandroid.data.RepoServiceModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by anilreddy on 3/8/2018.
 */

@Singleton
@Component(modules = {ApplicationModule.class,
        ActivityBindingModule.class,
        RepoServiceModule.class,})
public interface ApplicationComponent {
    void inject(MyApplication myApplication);
}
