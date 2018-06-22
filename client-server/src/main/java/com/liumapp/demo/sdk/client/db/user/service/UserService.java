package com.liumapp.demo.sdk.client.db.user.service;

import com.liumapp.demo.sdk.client.db.user.domain.User;

/**
 * @author liumapp
 * @file UserService.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/19/18
 */
public interface UserService {

    int insert (User user);

    User selectByPrimaryKey(Long userId);

}
