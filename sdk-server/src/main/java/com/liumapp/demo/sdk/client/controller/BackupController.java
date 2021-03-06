package com.liumapp.demo.sdk.client.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.liumapp.demo.sdk.client.db.backup.domain.Backup;
import com.liumapp.demo.sdk.client.db.backup.service.BackUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author liumapp
 * @file BackupController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/22/18
 */
@RestController
@RequestMapping("backup")
public class BackupController {

    @Autowired
    private BackUpService backUpService;

    @RequestMapping("/add")
    public String addItem (@RequestBody Backup backup) {
        backup.setCreatat(new Date());
        backUpService.insert(backup);
        JSONObject object = new JSONObject();
        object.put("id", backup.getId());
        return JSON.toJSONString(object);
    }

    @RequestMapping("/get")
    public String getItem (@RequestBody Backup backup) {
        backup = backUpService.selectByPrimaryKey(backup.getId());
        return JSON.toJSONString(backup);
    }

}
