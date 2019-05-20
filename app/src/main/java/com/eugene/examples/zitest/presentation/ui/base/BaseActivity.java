package com.eugene.examples.zitest.presentation.ui.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    protected BasePresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(provideActivity());
        initPresenter();
        initViews();
    }

    @LayoutRes
    protected abstract int provideActivity();

    protected abstract void initPresenter();

    protected abstract void initViews();
}
