package com.eugene.examples.zitest.presentation.ui.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public abstract class BasePresenterImpl implements BasePresenter {
    private CompositeDisposable disposables = new CompositeDisposable();

    protected BaseView view;

    @Override
    public void bind(BaseView view) {
        this.view = view;
    }

    @Override
    public void unbind() {
        view = null;
        disposables.clear();
    }

    protected void addDisposable(Disposable disposable) {
        disposables.add(disposable);
    }
}
