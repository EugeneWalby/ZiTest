package com.eugene.examples.zitest;

import android.app.Application;

import com.eugene.examples.zitest.data.network.ApiService;
import com.eugene.examples.zitest.data.network.NetworkManager;

public class App extends Application {
    private static App instance;

    public static App getInstance() {
        if (instance == null) {
            synchronized (App.class) {
                if (instance == null) {
                    instance = new App();
                }
            }
        }
        return instance;
    }

    private ApiService apiService;

    @Override
    public void onCreate() {
        super.onCreate();
        apiService = NetworkManager.getInstance().createApiService();
    }

    public ApiService getApiService() {
        return apiService;
    }
}
