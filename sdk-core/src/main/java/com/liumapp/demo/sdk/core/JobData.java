package com.liumapp.demo.sdk.core;

/**
 * @author liumapp
 * @file JobData.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/22/18
 */
public abstract class JobData {

    public String appKey;

    public String appSecret;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

}
