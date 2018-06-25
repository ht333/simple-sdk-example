package com.liumapp.demo.sdk.core.backup;

import com.liumapp.demo.sdk.core.JobDetail;
import com.liumapp.demo.sdk.core.backup.require.AddBackUpItemRequire;
import com.liumapp.demo.sdk.core.http.HttpUtil;

/**
 * @author liumapp
 * @file AddBackUpItem.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/22/18
 */
public class AddBackUpItem extends JobDetail<AddBackUpItemRequire> {

    private HttpUtil httpUtil;

    public AddBackUpItem() {
        this.httpUtil = new HttpUtil();
    }

    public String handle(AddBackUpItemRequire data) {

        return null;
    }

}
