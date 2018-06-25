package com.liumapp.demo.sdk.core.backup.require;

import com.liumapp.demo.sdk.core.JobData;

/**
 * @author liumapp
 * @file AddBackUpItemRequire.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 6/23/18
 */
public class AddBackUpItemRequire extends JobData {

    private String backupData;

    public String getBackupData() {
        return backupData;
    }

    public void setBackupData(String backupData) {
        this.backupData = backupData;
    }
}
