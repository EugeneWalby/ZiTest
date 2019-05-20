package com.eugene.examples.zitest.data.network;

import com.eugene.examples.zitest.data.network.model.response.ResultResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("api.php")
    Observable<ResultResponse> getResultsByQuery(@Query("query") String query);
}
