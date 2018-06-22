package com.liumapp.demo.sdk.client.db.testb.service;

import com.liumapp.demo.druid.complex.api.entity.TradeDetail;
import com.liumapp.demo.druid.complex.api.db.testb.domain.Trade;
import com.liumapp.demo.sdk.client.db.testb.domain.Trade;
import com.liumapp.demo.sdk.client.entity.TradeDetail;

/**
 * @author liumapp
 * @file TradeService.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
public interface TradeService {

    int insert (Trade trade);

    TradeDetail selectOrderDetail (Trade trade);

}
