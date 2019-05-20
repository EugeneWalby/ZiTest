package com.eugene.examples.zitest.presentation.di.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module(includes = ApiModule.class)
public class ApplicationModule {
    private Context context;

    ApplicationModule(Context context) {
        this.context = context;
    }

    @Provides
    Context provideApplicationContext() {
        return context.getApplicationContext();
    }
}
