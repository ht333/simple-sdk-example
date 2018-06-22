package com.liumapp.demo.sdk.client.db.user.mapper;

import com.liumapp.demo.sdk.client.db.user.domain.UserExample;
import com.liumapp.demo.sdk.client.db.user.domain.User;

import java.util.List;

import com.liumapp.demo.sdk.client.db.user.domain.UserExample;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}