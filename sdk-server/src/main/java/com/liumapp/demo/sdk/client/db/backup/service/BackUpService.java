package com.liumapp.demo.sdk.client.db.backup.service;

import com.liumapp.demo.sdk.client.db.backup.domain.Backup;

/**
 * @author liumapp
 * @file BackUpService.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/22/18
 */
public interface BackUpService {

    int insert (Backup backup);

    Backup selectByPrimaryKey (Long id);

}
