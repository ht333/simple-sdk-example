package com.liumapp.demo.sdk.core;

/**
 * @author liumapp
 * @file JobDetail.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/22/18
 */
public abstract class JobDetail<T extends JobData> {

    public abstract String handle ( T data);

}
