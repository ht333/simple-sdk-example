package com.liumapp.demo.sdk.core;

import com.alibaba.fastjson.JSONObject;

/**
 * @author liumapp
 * @file SdKCore.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/25/18
 */
public class SdKCore {

    public JSONObject doJob (JobDetail jobDetail, JobData jobData) {
        return jobDetail.handle(jobData);
    }

}
