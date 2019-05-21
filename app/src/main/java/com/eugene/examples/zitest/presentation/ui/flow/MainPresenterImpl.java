package com.eugene.examples.zitest.presentation.ui.flow;

import android.util.Log;

import com.eugene.examples.zitest.presentation.ui.base.BasePresenterImpl;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainPresenterImpl extends BasePresenterImpl implements MainPresenter {
    @Override
    public void getResultsByQuery(String query) {
        addDisposable(apiInteractor.getResultsByQuery(query)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(
                        resultResponse -> {
                            Log.d("---", resultResponse.toString());
                        },
                        throwable -> {
                            Log.d("---", throwable.getMessage());
                        }
                ));
    }
}
