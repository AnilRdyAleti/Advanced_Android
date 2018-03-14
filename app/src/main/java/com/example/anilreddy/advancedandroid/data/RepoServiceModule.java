package com.example.anilreddy.advancedandroid.data;

import com.example.anilreddy.advancedandroid.model.Repo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by anilreddy on 3/13/2018.
 */

@Module
public class RepoServiceModule {

    @Singleton
    @Provides
    static RepoService provideRepoService(Retrofit retrofit){
        return retrofit.create(RepoService.class);
    }
}
