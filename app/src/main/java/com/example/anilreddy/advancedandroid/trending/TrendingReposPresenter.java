package com.example.anilreddy.advancedandroid.trending;

import com.example.anilreddy.advancedandroid.data.RepoRequest;
import com.example.anilreddy.advancedandroid.di.ScreenScope;
import com.example.anilreddy.advancedandroid.model.Repo;

import javax.inject.Inject;

@ScreenScope
public class TrendingReposPresenter implements RepoAdapter.RepoClickedListener {

    private final TrendingReposViewModel viewModel;
    private final RepoRequest repoRequest;

    @Inject
    TrendingReposPresenter(TrendingReposViewModel viewModel, RepoRequest repoRequest) {
        this.repoRequest = repoRequest;
        this.viewModel = viewModel;

        loadRepos();
    }

    private void loadRepos() {
        repoRequest.getTrendingRepo()
                .doOnSubscribe(__ -> viewModel.loadingUpdated().accept(true))
                .doOnEvent((d, t) -> viewModel.loadingUpdated().accept(false))
                .subscribe(viewModel.reposUpdated(), viewModel.onError());
    }

    @Override
    public void onRepoClicked(Repo repo) {
//ToDo
    }
}
