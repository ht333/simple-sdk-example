package com.liumapp.demo.sdk.client.controller;

import com.liumapp.demo.sdk.client.entity.TradeDetail;
import com.liumapp.demo.sdk.core.SdKCore;
import com.liumapp.demo.sdk.core.backup.AddBackUpItem;
import com.liumapp.demo.sdk.core.backup.GetBackUpItem;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file BackUpController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/22/18
 */
@RestController
@RequestMapping("backup")
public class BackUpController {

    @RequestMapping("/add")
    public String addItem (@RequestBody TradeDetail tradeDetail) {
        SdKCore sdKCore = new SdKCore();
        AddBackUpItem addBackUpItem = new AddBackUpItem();
        AddBackUpItemRequire addBackUpItemRequire = new AddBackUpItemRequire();
        return sdKCore.doJob(addBackUpItem, addBackUpItemRequire);
    }

    @RequestMapping("/get")
    public String getItem () {
        SdKCore sdKCore = new SdKCore();
        GetBackUpItem getBackUpItem = new GetBackUpItem();
        GetBackUpItemRequire getBackUpItemRequire = new GetBackUpItemRequire();
        return sdKCore.doJob(getBackUpItem, getBackUpItemRequire);
    }

}
