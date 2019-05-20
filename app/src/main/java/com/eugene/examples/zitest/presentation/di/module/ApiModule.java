package com.eugene.examples.zitest.presentation.di.module;

import com.eugene.examples.zitest.data.network.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Singleton
@Module(includes = NetworkModule.class)
public class ApiModule {
    @Singleton
    @Provides
    ApiService provideApiService(Retrofit retrofit) {
        return retrofit.create(ApiService.class);
    }
}
