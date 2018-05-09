package com.example.anilreddy.advancedandroid.trending;

import org.junit.Before;
import org.junit.Test;

import io.reactivex.observers.TestObserver;

public class TrendingReposViewModelTest {

    private TrendingReposViewModel viewModel;

    @Before
    public void setUp() throws Exception {
        viewModel = new TrendingReposViewModel();
    }

    @Test
    public void loading() throws Exception {
        TestObserver<Boolean> loadingObserver = viewModel.loading().test();
        viewModel.loadingUpdated().accept(true);
        viewModel.loadingUpdated().accept(false);
        loadingObserver.assertValues(true, false);
    }

    @Test
    public void error() {
    }

    @Test
    public void repos() {
    }
}