package com.liumapp.demo.sdk.client.db.trade.service;

import com.liumapp.demo.sdk.client.entity.TradeDetail;
import com.liumapp.demo.sdk.client.db.trade.domain.Trade;

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
