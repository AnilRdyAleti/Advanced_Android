package com.example.anilreddy.advancedandroid.trending;

import com.example.anilreddy.advancedandroid.data.RepoRequest;
import com.example.anilreddy.advancedandroid.data.TrendingReposResponse;
import com.example.anilreddy.advancedandroid.model.Repo;
import com.example.anilreddy.advancedandroid.testUtils.TestUtils;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import io.reactivex.Single;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

public class TrendingReposPresenterTest {

    @Mock
    RepoRequest repoRequest;
    @Mock
    TrendingReposViewModel trendingReposViewModel;
    @Mock
    Consumer<Throwable> onErrorConsumer;
    @Mock
    Consumer<Boolean> loadingConsumer;
    @Mock
    Consumer<List<Repo>> onSuccessConsumer;

    private TrendingReposPresenter presenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
//        when(trendingReposViewModel.loadingUpdated()).thenReturn(loadingConsumer);
//        when(trendingReposViewModel.onError()).thenReturn(onErrorConsumer);
//        when(trendingReposViewModel.loadingUpdated()).thenReturn(onSuccessConsumer);

    }

    @Test
    public void reposLoaded() throws Exception {
        List<Repo> repos = setUpSuccess();
        initializePresenter();

        verify(repoRequest).getTrendingRepo();
        verify(onSuccessConsumer).accept(repos);
        verifyZeroInteractions(onErrorConsumer);
    }

    @Test
    public void reposLoadedError() throws Exception {
        Throwable error = setUpError();
        initializePresenter();

        verify(onErrorConsumer).accept(error);
        verifyZeroInteractions(onSuccessConsumer);
    }

    @Test
    public void loadingSuccess() throws Exception{
        setUpSuccess();
        initializePresenter();

        InOrder inOrder = Mockito.inOrder(loadingConsumer);
        inOrder.verify(loadingConsumer).accept(true);
        inOrder.verify(loadingConsumer).accept(false);

    }

    @Test
    public void loadingError() throws Exception{
        setUpError();
        initializePresenter();

        InOrder inOrder = Mockito.inOrder(loadingConsumer);
        inOrder.verify(loadingConsumer).accept(true);
        inOrder.verify(loadingConsumer).accept(false);

    }

    private Throwable setUpError() {

        Throwable error = new IOException();
        when(repoRequest.getTrendingRepo()).thenReturn(Single.error(error));
        return error;
    }

    @Test
    public void onRepoClicked() throws Exception {
    }

    private List<Repo> setUpSuccess() {
        TrendingReposResponse response = TestUtils.loadJson("mock/get_trending_repos.json", TrendingReposResponse.class);
        List<Repo> repos = response.repos();

        when(repoRequest.getTrendingRepo()).thenReturn(Single.just(repos));
        return repos;
    }

    private void initializePresenter() {
        presenter = new TrendingReposPresenter(trendingReposViewModel, repoRequest);
    }
}