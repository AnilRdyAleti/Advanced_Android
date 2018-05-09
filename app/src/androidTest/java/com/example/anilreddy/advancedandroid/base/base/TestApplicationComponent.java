package com.example.anilreddy.advancedandroid.base.base;

import com.example.anilreddy.advancedandroid.base.ActivityBindingModule;
import com.example.anilreddy.advancedandroid.base.ApplicationComponent;
import com.example.anilreddy.advancedandroid.base.ApplicationModule;
import com.example.anilreddy.advancedandroid.data.RepoServiceModule;
import com.example.anilreddy.advancedandroid.networking.ServiceModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ActivityBindingModule.class, ServiceModule.class, RepoServiceModule.class})
public interface TestApplicationComponent extends ApplicationComponent {
}
