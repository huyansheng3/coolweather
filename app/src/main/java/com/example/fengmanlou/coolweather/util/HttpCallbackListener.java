package com.example.fengmanlou.coolweather.util;

/**
 * Created by fengmanlou on 2015/3/30.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
