package com.example.wangmingxin.coolweather.util;

/**
 * Created by wangmingxin on 15/11/16.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
