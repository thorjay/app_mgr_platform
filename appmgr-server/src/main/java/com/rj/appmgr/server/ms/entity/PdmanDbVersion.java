package com.rj.appmgr.server.ms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;

/**
 * <p>
 * 
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("pdman_db_version")
@ApiModel(value = "PdmanDbVersion对象", description = "")
public class PdmanDbVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    private String dbVersion;

    private String versionDesc;

    private String createdTime;


    public String getDbVersion() {
        return dbVersion;
    }

    public void setDbVersion(String dbVersion) {
        this.dbVersion = dbVersion;
    }

    public String getVersionDesc() {
        return versionDesc;
    }

    public void setVersionDesc(String versionDesc) {
        this.versionDesc = versionDesc;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "PdmanDbVersion{" +
        "dbVersion=" + dbVersion +
        ", versionDesc=" + versionDesc +
        ", createdTime=" + createdTime +
        "}";
    }
}
