package com.liumapp.demo.sdk.core.backup;

import com.alibaba.fastjson.JSONObject;
import com.liumapp.demo.sdk.core.JobData;
import com.liumapp.demo.sdk.core.JobDetail;
import com.liumapp.demo.sdk.core.file.FileSaveAble;

/**
 * @author liumapp
 * @file AddFileBackUpItem.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/22/18
 */
public class AddFileBackUpItem extends JobDetail implements FileSaveAble {

    public JSONObject handle(JobData data) {
        return null;
    }
}
