package com.example.anilreddy.advancedandroid.data;

import com.example.anilreddy.advancedandroid.model.Repo;

import java.util.List;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by anilreddy on 3/13/2018.
 */

public class RepoRequest {

    private final RepoService service;

    // @Inject
    RepoRequest(RepoService service) {
        this.service = service;
    }

    public Single<List<Repo>> getTrendingRepo() {
        return service.getTrendingRepos()
                .map(TrendingReposResponse::repos)
                .subscribeOn(Schedulers.io());
    }
}
