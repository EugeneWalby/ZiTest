package com.eugene.examples.zitest.presentation.ui.base;

import com.eugene.examples.zitest.domain.interactor.ApiInteractor;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public abstract class BasePresenterImpl implements BasePresenter {
    private CompositeDisposable disposables = new CompositeDisposable();
    protected ApiInteractor apiInteractor;
    protected BaseView view;

    protected BasePresenterImpl() {
        apiInteractor = new ApiInteractor();
    }

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
