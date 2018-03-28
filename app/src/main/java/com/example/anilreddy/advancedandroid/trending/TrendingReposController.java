package com.example.anilreddy.advancedandroid.trending;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.anilreddy.advancedandroid.R;
import com.example.anilreddy.advancedandroid.base.BaseController;

import javax.inject.Inject;

import butterknife.BindView;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

/**
 * Created by anilreddy on 3/12/2018.
 */

public class TrendingReposController extends BaseController {

    @Inject
    TrendingReposPresenter presenter;
    @Inject
    TrendingReposViewModel viewModel;

    @BindView(R.id.repo_list)
    RecyclerView repoList;
    @BindView(R.id.loading_indicator)
    ProgressBar loadingView;
    @BindView(R.id.tv_error)
    TextView errorText;

    @Override
    protected int layoutRes() {
        return R.layout.screen_trending_repos;
    }

    @Override
    protected Disposable[] subscriptions() {
        return new Disposable[]{
                viewModel.loading()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(loading -> {
                    repoList.setVisibility(loading ? View.VISIBLE : View.GONE);
                    loadingView.setVisibility(loading ? View.VISIBLE : View.GONE);
                    errorText.setVisibility(loading ? View.VISIBLE : View.GONE);
                }),
                viewModel.repos()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(loading -> {
                    //TODO
                }),
                viewModel.error()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(errorRes -> {
                    if (errorRes == -1) {
                        errorText.setText(null);
                        errorText.setVisibility(View.GONE);
                    } else {
                        errorText.setText(errorRes);
                        errorText.setVisibility(View.VISIBLE);
                        repoList.setVisibility(View.GONE);
                    }
                })
        };
    }
}
