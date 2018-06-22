package com.liumapp.demo.sdk.client.controller;

import com.alibaba.fastjson.JSON;
import com.liumapp.demo.sdk.client.db.backup.domain.Backup;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/add")
    public String addItem (@RequestBody Backup backup) {

        return JSON.toJSONString("success");
    }

    @RequestMapping("/get")
    public String getItem () {
        return JSON.toJSONString("success");
    }

}
