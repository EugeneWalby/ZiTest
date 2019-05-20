package com.eugene.examples.zitest.presentation.ui.flow;

import android.util.Log;

import com.eugene.examples.zitest.data.network.ApiService;
import com.eugene.examples.zitest.data.network.NetworkManager;
import com.eugene.examples.zitest.presentation.ui.base.BasePresenterImpl;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainPresenterImpl extends BasePresenterImpl implements MainPresenter {
    private ApiService apiService;

    MainPresenterImpl() {
        apiService = NetworkManager.getInstance().createApiService();
    }

    public void getResultsByQuery(String query) {
        addDisposable(apiService.getResultsByQuery(query)
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
