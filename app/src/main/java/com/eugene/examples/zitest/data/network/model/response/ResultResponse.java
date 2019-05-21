package com.eugene.examples.zitest.data.network.model.response;

import com.eugene.examples.zitest.domain.model.DataEntity;
import com.eugene.examples.zitest.domain.model.ResultEntity;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ResultResponse implements BaseResponse<ResultEntity> {
    @SerializedName("message")
    private String message;

    @SerializedName("data")
    private List<DataResponse> dataList;

    @Override
    public ResultEntity transformToDomain() {
        List<DataEntity> dataList = new ArrayList<>();
        for (int i = 0; i < this.dataList.size(); i++) {
            dataList.add(this.dataList.get(i).transformToDomain());
        }
        return new ResultEntity(message, dataList);
    }
}
