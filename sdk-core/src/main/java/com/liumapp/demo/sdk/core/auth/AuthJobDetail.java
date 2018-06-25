package com.liumapp.demo.sdk.core.auth;

import com.liumapp.demo.sdk.core.JobData;
import com.liumapp.demo.sdk.core.JobDetail;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liumapp
 * @file AuthJobDetail.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/25/18
 */
public abstract class AuthJobDetail<T extends JobData> extends JobDetail<T> implements AuthStrategy {

    public Map<String, String> getAuthenticationHeaders(JobData data) {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("appKey", data.getAppKey());
        headers.put("appSecret", data.getAppSecret());
        headers.put("Content-Type", "application/json");
        return headers;
    }
}
