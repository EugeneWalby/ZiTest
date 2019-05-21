package com.eugene.examples.zitest.domain.model;

import android.support.annotation.NonNull;

public class DataEntity {
    private String url;
    private String title;

    public DataEntity(String url, String title) {
        this.url = url;
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @NonNull
    @Override
    public String toString() {
        return "DataEntity{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
