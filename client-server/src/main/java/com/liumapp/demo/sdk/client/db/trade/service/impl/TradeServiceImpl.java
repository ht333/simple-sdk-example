package com.liumapp.demo.sdk.client.db.trade.service.impl;

import com.liumapp.demo.sdk.client.entity.TradeDetail;
import com.liumapp.demo.sdk.client.db.user.domain.ShippingAddress;
import com.liumapp.demo.sdk.client.db.user.domain.User;
import com.liumapp.demo.sdk.client.db.trade.domain.Trade;
import com.liumapp.demo.sdk.client.db.trade.mapper.TradeMapper;
import com.liumapp.demo.sdk.client.db.user.service.ShippingAddressService;
import com.liumapp.demo.sdk.client.db.user.service.UserService;
import com.liumapp.demo.sdk.client.db.trade.service.TradeService;
import com.liumapp.demo.sdk.client.entity.TradeDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liumapp
 * @file TradeServiceImpl.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
@Service
@Transactional
public class TradeServiceImpl implements TradeService {

    @Autowired
    private TradeMapper tradeMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private ShippingAddressService shippingAddressService;

    @Override
    public int insert(Trade trade) {
        return tradeMapper.insert(trade);
    }

    @Override
    public TradeDetail selectOrderDetail(Trade trade) {
        User user = userService.selectByPrimaryKey(trade.getUserid());
        ShippingAddress shippingAddress = shippingAddressService.selectByUserId(trade.getUserid());
        trade = tradeMapper.selectByPrimaryKey(trade.getId());
        TradeDetail tradeDetail = new TradeDetail(trade, user, shippingAddress);
        return tradeDetail;
    }

}
