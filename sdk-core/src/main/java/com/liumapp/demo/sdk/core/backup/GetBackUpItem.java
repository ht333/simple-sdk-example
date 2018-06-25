package com.liumapp.demo.sdk.core.backup;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.demo.sdk.core.JobDetail;
import com.liumapp.demo.sdk.core.auth.AuthJobDetail;
import com.liumapp.demo.sdk.core.backup.require.GetBackUpItemRequire;
import com.liumapp.demo.sdk.core.conf.HostConfig;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liumapp
 * @file GetBackUpItem.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/23/18
 */
public class GetBackUpItem extends AuthJobDetail<GetBackUpItemRequire> {

    public JSONObject handle(GetBackUpItemRequire data) {
        Map<String, String> querys = new HashMap<String, String>();
        JSONObject object = new JSONObject();
        object.put("data", data.getId());
        String bodys = object.toJSONString();
        try {
            HttpResponse response = this.httpUtil.doPost(HostConfig.host,
                    HostConfig.getBackUpItemPath,
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
