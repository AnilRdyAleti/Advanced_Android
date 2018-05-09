package com.example.anilreddy.advancedandroid.details;

import android.os.Bundle;

import com.bluelinelabs.conductor.Controller;
import com.example.anilreddy.advancedandroid.R;
import com.example.anilreddy.advancedandroid.base.BaseController;

public class ReposDetailsController extends BaseController {

    static final String REPO_NAME_KEY = "repo_name";
    static final String REPO_OWNER_KEY = "repo_owner";

    public static Controller newInstance(String repoName, String repoOwner) {
        Bundle bundle = new Bundle();
        bundle.putString(REPO_NAME_KEY, repoName);
        bundle.putString(REPO_OWNER_KEY, repoOwner);
        return new ReposDetailsController(bundle);

    }

    public ReposDetailsController(Bundle bundle) {
        super(bundle);
    }

    @Override
    protected int layoutRes() {
        return R.layout.screen_trending_repos;
    }
}
