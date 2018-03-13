package com.example.anilreddy.advancedandroid.networking;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/**
 * Created by anilreddy on 3/13/2018.
 */

@Module
public abstract class NetworkModule {

    @Provides
    @Singleton
    static Call.Factory provideOkHttp(){
        return new OkHttpClient.Builder().build();
    }

    @Provides
    @Named("BASE_URL")
    static String baseUrl(){
        return "https://api.github.com/";
    }
}
