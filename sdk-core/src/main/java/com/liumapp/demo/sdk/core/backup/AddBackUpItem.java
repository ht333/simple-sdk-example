package com.liumapp.demo.sdk.core.backup;

import com.liumapp.demo.sdk.core.JobDetail;
import com.liumapp.demo.sdk.core.auth.AuthJobDetail;
import com.liumapp.demo.sdk.core.auth.AuthStrategy;
import com.liumapp.demo.sdk.core.backup.require.AddBackUpItemRequire;
import com.liumapp.demo.sdk.core.conf.HostConfig;
import com.liumapp.demo.sdk.core.http.HttpUtil;

import java.util.Map;

/**
 * @author liumapp
 * @file AddBackUpItem.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/22/18
 */
public class AddBackUpItem extends AuthJobDetail<AddBackUpItemRequire> {

    private HttpUtil httpUtil;

    public AddBackUpItem() {
        this.httpUtil = new HttpUtil();
    }

    public String handle(AddBackUpItemRequire data) {
        httpUtil.doPost(HostConfig.host, HostConfig.addBackUpItemPath, "POST",);
        return null;
    }

}
