package com.liumapp.demo.sdk.core.backup;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.demo.sdk.core.JobData;
import com.liumapp.demo.sdk.core.JobDetail;
import com.liumapp.demo.sdk.core.auth.AuthJobDetail;
import com.liumapp.demo.sdk.core.auth.AuthStrategy;
import com.liumapp.demo.sdk.core.backup.require.AddBackUpItemRequire;
import com.liumapp.demo.sdk.core.conf.HostConfig;
import com.liumapp.demo.sdk.core.http.HttpUtil;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liumapp
 * @file AddBackUpItem.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/22/18
 */
public class AddBackUpItem extends AuthJobDetail<AddBackUpItemRequire> {

    public JSONObject handle(AddBackUpItemRequire data) {
        Map<String, String> querys = new HashMap<String, String>();
        JSONObject object = new JSONObject();
        object.put("data", data.getBackupData());
        String bodys = object.toJSONString();
        try {
            HttpResponse response = this.httpUtil.doPost(HostConfig.host,
                    HostConfig.addBackUpItemPath,
                    "POST",
                    getAuthenticationHeaders(data),
                    querys,
                    bodys);
            String res = EntityUtils.toString(response.getEntity());
            JSONObject res_obj = JSON.parseObject(res);
            return res_obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
