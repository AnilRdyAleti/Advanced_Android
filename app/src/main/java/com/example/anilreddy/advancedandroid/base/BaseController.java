package com.example.anilreddy.advancedandroid.base;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bluelinelabs.conductor.Controller;
import com.example.anilreddy.advancedandroid.di.Injector;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by anilreddy on 3/12/2018.
 */

public abstract class BaseController extends Controller {

    private final CompositeDisposable disposables = new CompositeDisposable();
    public boolean injected = false;
    private Unbinder unbinder;

    @Override
    protected void onContextAvailable(@NonNull Context context) {
        if (!injected) {
            Injector.Inject(this);
            injected = true;
        }
        super.onContextAvailable(context);
    }

    @NonNull
    @Override
    protected final View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container) {
        View view = inflater.inflate(layoutRes(), container, false);
        unbinder = ButterKnife.bind(this, view);
        onViewBind(view);
        disposables.addAll(subscriptions());
        return view;
    }

    @Override
    protected void onDestroy() {
        disposables.clear();
        if (unbinder != null) {
            unbinder.unbind();
            unbinder = null;
        }
    }

    protected void onViewBind(View view) {

    }

    protected Disposable[] subscriptions() {
        return new Disposable[0];
    }

    @LayoutRes
    protected abstract int layoutRes();
}
