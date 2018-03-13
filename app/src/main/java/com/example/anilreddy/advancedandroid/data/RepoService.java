package com.example.anilreddy.advancedandroid.data;

import io.reactivex.Single;
import retrofit2.http.GET;

/**
 * Created by anilreddy on 3/13/2018.
 */

public interface RepoService {

    @GET("search/repositories?q=language:java&order=desc&sort=starts")
    Single<TrendingReposResponse> getTrendingRepos();

}
