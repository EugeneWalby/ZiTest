package com.eugene.examples.zitest.domain.interactor;

import com.eugene.examples.zitest.data.network.ApiService;
import com.eugene.examples.zitest.data.network.NetworkManager;
import com.eugene.examples.zitest.data.network.model.response.ResultResponse;
import com.eugene.examples.zitest.domain.model.ResultEntity;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class ApiInteractor {
    private ApiService apiService;

    public ApiInteractor() {
        apiService = NetworkManager.getInstance().createApiService();
    }

    public Observable<ResultEntity> getResultsByQuery(String query) {
        return apiService.getResultsByQuery(query)
                .map(ResultResponse::transformToDomain)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.computation());
    }
}
