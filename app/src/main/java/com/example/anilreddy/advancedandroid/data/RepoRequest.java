package com.example.anilreddy.advancedandroid.data;

import com.example.anilreddy.advancedandroid.model.Repo;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by anilreddy on 3/13/2018.
 */

public class RepoRequest {

    private final RepoService service;

    @Inject
    RepoRequest(RepoService service) {
        this.service = service;
    }

    Single<List<Repo>> getTrendingRepo() {
        return service.getTrendingRepos()
                .map(new Function<TrendingReposResponse, List<Repo>>() {
                    @Override
                    public List<Repo> apply(TrendingReposResponse trendingReposResponse) throws Exception {
                        return trendingReposResponse.repos();
                    }
                }).subscribeOn(Schedulers.io());
    }
}
