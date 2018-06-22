package com.liumapp.demo.sdk.core;

public class SdKCore {

    public String doJob (JobDetail jobDetail, JobData jobData) {
        return jobDetail.handle(jobData);
    }

}
