package com.feel.codeblog.ui;

import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.feel.codeblog.R;
import com.project.ui.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ActLogin extends BaseActivity {

    @BindView(R.id.edit_account)
    EditText editAccount;
    @BindView(R.id.edit_password)
    EditText editPassword;
    @BindView(R.id.btn_login)
    Button btnLogin;
    @BindView(R.id.tv_forget_pwd)
    TextView tvForgetPwd;
    @BindView(R.id.login_interval_line)
    View loginIntervalLine;
    @BindView(R.id.tv_register)
    TextView tvRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_act_login_view);
        initViews();
        initParams();
        initListeners();
    }

    @Override
    public void initViews() {
        ButterKnife.bind(this);
    }

    @Override
    public void initParams() {
        if (Build.VERSION.SDK_INT >= 15) {
            loginIntervalLine.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }
    }

    @Override
    public void initListeners() {

    }
}
