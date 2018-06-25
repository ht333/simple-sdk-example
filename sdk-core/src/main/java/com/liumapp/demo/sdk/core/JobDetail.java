package com.liumapp.demo.sdk.core;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.demo.sdk.core.http.HttpUtil;

/**
 * @author liumapp
 * @file JobDetail.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/22/18
 */
public abstract class JobDetail<T extends JobData> {

    protected HttpUtil httpUtil;

    public JobDetail() {
        this.httpUtil = new HttpUtil();
    }

    public abstract JSONObject handle (T data);

}
