package com.eugene.examples.zitest.presentation.di.component;

import com.eugene.examples.zitest.presentation.di.module.ActivityModule;
import com.eugene.examples.zitest.presentation.ui.flow.MainPresenterImpl;

import javax.inject.Singleton;

import dagger.Subcomponent;

@Singleton
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainPresenterImpl presenter);
}
