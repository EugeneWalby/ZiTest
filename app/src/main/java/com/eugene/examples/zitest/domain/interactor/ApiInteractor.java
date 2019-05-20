package com.eugene.examples.zitest.domain.interactor;

import com.eugene.examples.zitest.data.network.ApiService;
import com.eugene.examples.zitest.data.network.model.response.ResultResponse;

import javax.inject.Inject;

import io.reactivex.Observable;

public class ApiInteractor {
    private ApiService apiService;

    @Inject
    ApiInteractor(ApiService apiService) {
        this.apiService = apiService;
    }

    public Observable<ResultResponse> getResultsByQuery(String query) {
        return apiService.getResultsByQuery(query);
    }
}
