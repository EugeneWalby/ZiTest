package com.eugene.examples.zitest.data.network.model.response;

import com.eugene.examples.zitest.domain.model.DataEntity;
import com.google.gson.annotations.SerializedName;

public class DataResponse implements BaseResponse<DataEntity> {
    @SerializedName("url")
    private String url;

    @SerializedName("title")
    private String title;

    @Override
    public DataEntity transformToDomain() {
        return new DataEntity(url, title);
    }
}
