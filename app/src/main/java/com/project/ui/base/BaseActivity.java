package com.project.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @author Eric
 * @desc Activity基类
 * @date 2016-06-17
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public abstract void initViews();
    public abstract void initParams();
    public abstract void initListeners();
}
