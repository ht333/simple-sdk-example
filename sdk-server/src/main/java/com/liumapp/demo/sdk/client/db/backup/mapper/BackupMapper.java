package com.liumapp.demo.sdk.client.db.backup.mapper;

import com.liumapp.demo.sdk.client.db.backup.domain.Backup;
import com.liumapp.demo.sdk.client.db.backup.domain.BackupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackupMapper {
    long countByExample(BackupExample example);

    int deleteByExample(BackupExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Backup record);

    int insertSelective(Backup record);

    List<Backup> selectByExampleWithBLOBs(BackupExample example);

    List<Backup> selectByExample(BackupExample example);

    Backup selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Backup record, @Param("example") BackupExample example);

    int updateByExampleWithBLOBs(@Param("record") Backup record, @Param("example") BackupExample example);

    int updateByExample(@Param("record") Backup record, @Param("example") BackupExample example);

    int updateByPrimaryKeySelective(Backup record);

    int updateByPrimaryKeyWithBLOBs(Backup record);

    int updateByPrimaryKey(Backup record);
}