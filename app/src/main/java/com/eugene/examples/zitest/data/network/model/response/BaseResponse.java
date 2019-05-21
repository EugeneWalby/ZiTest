package com.eugene.examples.zitest.data.network.model.response;

public interface BaseResponse<T> {
    T transformToDomain();
}
