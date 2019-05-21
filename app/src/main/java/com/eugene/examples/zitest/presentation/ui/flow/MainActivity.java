package com.eugene.examples.zitest.presentation.ui.flow;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.eugene.examples.zitest.R;
import com.eugene.examples.zitest.presentation.ui.base.BaseActivity;
import com.eugene.examples.zitest.presentation.ui.base.BaseView;

public class MainActivity extends BaseActivity implements BaseView {
    private MainPresenter presenter;

    @Override
    protected int provideActivity() {
        return R.layout.activity_main;
    }

    @Override
    protected void initPresenter() {
        presenter = new MainPresenterImpl();
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.bind(this);
        presenter.getResultsByQuery("cat");
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.unbind();
    }
}
