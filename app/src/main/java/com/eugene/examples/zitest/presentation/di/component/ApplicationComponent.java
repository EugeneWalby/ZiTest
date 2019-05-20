package com.eugene.examples.zitest.presentation.di.component;

import com.eugene.examples.zitest.data.network.ApiService;
import com.eugene.examples.zitest.presentation.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    Retrofit retrofitInstance();

    ApiService apiService();
}
