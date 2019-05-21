package com.eugene.examples.zitest.domain.model;

import android.support.annotation.NonNull;

import java.util.List;

public class ResultEntity {
    private String message;
    private List<DataEntity> dataList;

    public ResultEntity(final String message, final List<DataEntity> dataList) {
        this.message = message;
        this.dataList = dataList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataEntity> getDataList() {
        return dataList;
    }

    public void setDataList(List<DataEntity> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public String toString() {
        return "ResultEntity{" +
                "message='" + message + '\'' +
                ", dataList=" + dataList +
                '}';
    }
}
