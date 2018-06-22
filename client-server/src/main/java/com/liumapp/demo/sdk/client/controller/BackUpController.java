package com.liumapp.demo.sdk.client.controller;

import com.alibaba.fastjson.JSON;
import com.liumapp.demo.sdk.client.entity.TradeDetail;
import com.liumapp.demo.sdk.core.SdKCore;
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
        
        return JSON.toJSONString("success");
    }

    @RequestMapping("/sdkAdd")
    public String addItemBySdk () {
        return JSON.toJSONString("success");
    }

    @RequestMapping("/get")
    public String getItem () {
        return JSON.toJSONString("success");
    }

    @RequestMapping("/sdkGet")
    public String getItemBySdk () {
        return JSON.toJSONString("success");
    }

}
