package com.example.anilreddy.advancedandroid.testUtils;

import com.example.anilreddy.advancedandroid.data.TrendingReposResponse;
import com.example.anilreddy.advancedandroid.model.AdapterFactory;
import com.example.anilreddy.advancedandroid.model.Repo;
import com.example.anilreddy.advancedandroid.model.ZonedDateTimeAdapter;
import com.squareup.moshi.Moshi;

import java.util.List;

public class TestUtils {

    private static TestUtils INSTANCE = new TestUtils();
    private static final Moshi MOSHI_INSTANCE = initializeMoshi();

    private TestUtils() {
    }

    private static Moshi initializeMoshi() {
        Moshi.Builder builder = new Moshi.Builder();
        builder.add(AdapterFactory.create());
        builder.add(new ZonedDateTimeAdapter());
        return builder.build();
    }

    public static TrendingReposResponse loadJson(String s, Class<TrendingReposResponse> trendingReposResponseClass) {
        return new TrendingReposResponse() {
            @Override
            public List<Repo> repos() {
                return null;
            }
        };
    }
}
