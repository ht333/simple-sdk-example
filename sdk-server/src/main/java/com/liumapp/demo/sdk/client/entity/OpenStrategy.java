package com.liumapp.demo.sdk.client.entity;

/**
 * @author liumapp
 * @file OpenStrategy.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/25/18
 */
public abstract class OpenStrategy {

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
