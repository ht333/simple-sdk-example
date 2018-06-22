package com.liumapp.demo.sdk.client.db.backup.service.impl;

import com.liumapp.demo.sdk.client.db.backup.domain.Backup;
import com.liumapp.demo.sdk.client.db.backup.mapper.BackupMapper;
import com.liumapp.demo.sdk.client.db.backup.service.BackUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author liumapp
 * @file BackUpServiceImpl.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/22/18
 */
@Service
@Transactional
public class BackUpServiceImpl implements BackUpService {

    @Autowired
    private BackupMapper backupMapper;

    @Override
    public int insert(Backup backup) {
        return backupMapper.insert(backup);
    }

    @Override
    public Backup selectByPrimaryKey(Long id) {
        return backupMapper.selectByPrimaryKey(id);
    }

}
