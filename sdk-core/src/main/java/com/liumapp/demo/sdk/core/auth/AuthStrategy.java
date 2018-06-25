package com.liumapp.demo.sdk.core.auth;

import com.liumapp.demo.sdk.core.JobData;

import java.util.Map;

/**
 * @author liumapp
 * @file AuthStrategy.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/25/18
 */
public interface AuthStrategy<T extends JobData>  {

    public Map<String, String> getAuthenticationHeaders (T data);

}
