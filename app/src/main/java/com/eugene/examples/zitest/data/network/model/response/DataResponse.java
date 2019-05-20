package com.eugene.examples.zitest.data.network.model.response;

import com.google.gson.annotations.SerializedName;

public class DataResponse {
    @SerializedName("url")
    private String url;

    @SerializedName("title")
    private String title;

    @Override
    public String toString() {
        return "DataResponse{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
