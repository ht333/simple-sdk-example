package com.liumapp.demo.sdk.core;

import com.alibaba.fastjson.JSONObject;

/**
 * @author liumapp
 * @file JobDetail.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/22/18
 */
public abstract class JobDetail<T extends JobData> {

    public abstract JSONObject handle (T data);

}
