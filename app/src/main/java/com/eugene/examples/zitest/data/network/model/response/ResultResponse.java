package com.eugene.examples.zitest.data.network.model.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResultResponse {
    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private List<DataResponse> dataList;

    @Override
    public String toString() {
        return "ResultResponse{" +
                "message='" + message + '\'' +
                ", dataList=" + dataList +
                '}';
    }
}
