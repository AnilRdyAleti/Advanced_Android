package com.example.anilreddy.advancedandroid.details;

import com.example.anilreddy.advancedandroid.di.ScreenScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@ScreenScope
@Subcomponent
public interface ReposDetailsComponent extends AndroidInjector<ReposDetailsController> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<ReposDetailsController> {

        @BindsInstance
        public abstract void bindRepoOwner(@Named("repo_owner") String repoOwner);

        @BindsInstance
        public abstract void bindRepoName(@Named("repo_name") String repoName);

        @Override
        public void seedInstance(ReposDetailsController instance) {
            bindRepoName(instance.getArgs().getString(ReposDetailsController.REPO_OWNER_KEY));
            bindRepoName(instance.getArgs().getString(ReposDetailsController.REPO_NAME_KEY));
        }
    }
}
