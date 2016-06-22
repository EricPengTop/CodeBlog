package com.codeblog.codeblogsdk.app;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/**
 * 全局变量信息
 * Created by Eric on 2016/6/22.
 */
public class CBAppContext {

    /**
     * 公共Handler
     */
    public static final Handler mMainHandler = new Handler(Looper.getMainLooper());

    /**
     * 初始化上下问
     */
    public static Context mMainContext = null;

    public static void init(Context mainContext) {
        mMainContext = mainContext.getApplicationContext();
    }

}
