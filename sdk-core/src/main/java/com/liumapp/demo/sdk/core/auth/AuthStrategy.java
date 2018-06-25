package com.liumapp.demo.sdk.core.auth;

import java.util.Map;

/**
 * @author liumapp
 * @file AuthStrategy.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/25/18
 */
public interface AuthStrategy  {

    public Map<String, String> getAuthenticationHeaders ();

}
