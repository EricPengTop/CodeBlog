package com.feel.codeblog.ui;

import android.content.Intent;
import android.os.Bundle;

import com.codeblogsdk.app.CBAppContext;
import com.feel.codeblog.R;
import com.project.ui.base.BaseActivity;

/**
 * 欢迎界面
 */
public class ActWelcome extends BaseActivity {

    private static final int DELAYED_TIME = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_act_welcome_view);
        initViews();
        initParams();
        initListeners();
    }

    @Override
    public void initViews() {

    }

    @Override
    public void initParams() {
        loadNextActivity();
    }

    @Override
    public void initListeners() {

    }

    private void loadNextActivity() {
        CBAppContext.mMainHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(ActLogin.class);
            }
        }, DELAYED_TIME);
    }

    public void startActivity(Class<?> cls){
        Intent mIntent = new Intent(this, cls);
        startActivity(mIntent);
        finish();
    }
}
