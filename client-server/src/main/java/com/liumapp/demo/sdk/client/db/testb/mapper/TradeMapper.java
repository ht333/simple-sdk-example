package com.liumapp.demo.sdk.client.db.testb.mapper;

import com.liumapp.demo.sdk.client.db.testb.domain.Trade;
import com.liumapp.demo.sdk.client.db.testb.domain.TradeExample;

import java.util.List;

import com.liumapp.demo.sdk.client.db.testb.domain.Trade;
import org.apache.ibatis.annotations.Param;

public interface TradeMapper {
    long countByExample(TradeExample example);

    int deleteByExample(TradeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Trade record);

    int insertSelective(Trade record);

    List<Trade> selectByExample(TradeExample example);

    Trade selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByExample(@Param("record") Trade record, @Param("example") TradeExample example);

    int updateByPrimaryKeySelective(Trade record);

    int updateByPrimaryKey(Trade record);
}