package com.rj.appmgr.server.ms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author larryjay
 * @since 2023-10-25
 */
@TableName("tab_app_info_his")
@ApiModel(value = "TabAppInfoHis对象", description = "")
public class TabAppInfoHis implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "TAB_HIS_ID", type = IdType.AUTO)
    private Integer tabHisId;

    @ApiModelProperty("参数中的APP_ID")
    private Integer appId;

    @ApiModelProperty("应用名称")
    private String appName;

    @ApiModelProperty("应用类型")
    private String appType;

    private String appPath;

    private String appRequestHost;

    private String appRequestServlet;

    private String appRequestPath;

    @ApiModelProperty("Android应用基础信息-资源地址")
    private String androidDownloadUrl;

    @ApiModelProperty("Android应用基础信息-应用唯一标识")
    private String androidPackageName;

    @ApiModelProperty("android应用的版本号")
    private String androidAppVersion;

    @ApiModelProperty("iOS应用基础信息-资源地址")
    private String iosDownloadUrl;

    @ApiModelProperty("iOS应用基础信息-应用唯一标识")
    private String iosPackageName;

    @ApiModelProperty("iOS应用版本号")
    private String iosAppVersion;

    @ApiModelProperty("子应用资源下载地址")
    private String subResHost;

    @ApiModelProperty("RN子应用的BUNDLE_KEY")
    private String rnBundleKey;

    @ApiModelProperty("RN子应用Android版url")
    private String rnBundleUrlAndroid;

    @ApiModelProperty("RN子应用iOS版url")
    private String rnBundleUrlIos;

    @ApiModelProperty("RN子应用版本号")
    private String rnBundleVersion;

    @ApiModelProperty("灰度发布环境请求地址")
    private String gReqHost;

    @ApiModelProperty("灰度发布环境请求根路径")
    private String gReqPath;

    @ApiModelProperty("灰度发布环境资源下载地址")
    private String gResHost;

    @ApiModelProperty("子应用静态资源地址")
    private String resourceUrl;

    private LocalDate createTime;

    @ApiModelProperty("扩展字段1")
    private String ext1;

    @ApiModelProperty("扩展字段2")
    private String ext2;

    @ApiModelProperty("扩展字段3")
    private String ext3;

    @ApiModelProperty("秘钥保存地址")
    private Integer deleteUser;

    private LocalDateTime deleteTime;


    public Integer getTabHisId() {
        return tabHisId;
    }

    public void setTabHisId(Integer tabHisId) {
        this.tabHisId = tabHisId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    public String getAppRequestHost() {
        return appRequestHost;
    }

    public void setAppRequestHost(String appRequestHost) {
        this.appRequestHost = appRequestHost;
    }

    public String getAppRequestServlet() {
        return appRequestServlet;
    }

    public void setAppRequestServlet(String appRequestServlet) {
        this.appRequestServlet = appRequestServlet;
    }

    public String getAppRequestPath() {
        return appRequestPath;
    }

    public void setAppRequestPath(String appRequestPath) {
        this.appRequestPath = appRequestPath;
    }

    public String getAndroidDownloadUrl() {
        return androidDownloadUrl;
    }

    public void setAndroidDownloadUrl(String androidDownloadUrl) {
        this.androidDownloadUrl = androidDownloadUrl;
    }

    public String getAndroidPackageName() {
        return androidPackageName;
    }

    public void setAndroidPackageName(String androidPackageName) {
        this.androidPackageName = androidPackageName;
    }

    public String getAndroidAppVersion() {
        return androidAppVersion;
    }

    public void setAndroidAppVersion(String androidAppVersion) {
        this.androidAppVersion = androidAppVersion;
    }

    public String getIosDownloadUrl() {
        return iosDownloadUrl;
    }

    public void setIosDownloadUrl(String iosDownloadUrl) {
        this.iosDownloadUrl = iosDownloadUrl;
    }

    public String getIosPackageName() {
        return iosPackageName;
    }

    public void setIosPackageName(String iosPackageName) {
        this.iosPackageName = iosPackageName;
    }

    public String getIosAppVersion() {
        return iosAppVersion;
    }

    public void setIosAppVersion(String iosAppVersion) {
        this.iosAppVersion = iosAppVersion;
    }

    public String getSubResHost() {
        return subResHost;
    }

    public void setSubResHost(String subResHost) {
        this.subResHost = subResHost;
    }

    public String getRnBundleKey() {
        return rnBundleKey;
    }

    public void setRnBundleKey(String rnBundleKey) {
        this.rnBundleKey = rnBundleKey;
    }

    public String getRnBundleUrlAndroid() {
        return rnBundleUrlAndroid;
    }

    public void setRnBundleUrlAndroid(String rnBundleUrlAndroid) {
        this.rnBundleUrlAndroid = rnBundleUrlAndroid;
    }

    public String getRnBundleUrlIos() {
        return rnBundleUrlIos;
    }

    public void setRnBundleUrlIos(String rnBundleUrlIos) {
        this.rnBundleUrlIos = rnBundleUrlIos;
    }

    public String getRnBundleVersion() {
        return rnBundleVersion;
    }

    public void setRnBundleVersion(String rnBundleVersion) {
        this.rnBundleVersion = rnBundleVersion;
    }

    public String getgReqHost() {
        return gReqHost;
    }

    public void setgReqHost(String gReqHost) {
        this.gReqHost = gReqHost;
    }

    public String getgReqPath() {
        return gReqPath;
    }

    public void setgReqPath(String gReqPath) {
        this.gReqPath = gReqPath;
    }

    public String getgResHost() {
        return gResHost;
    }

    public void setgResHost(String gResHost) {
        this.gResHost = gResHost;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public Integer getDeleteUser() {
        return deleteUser;
    }

    public void setDeleteUser(Integer deleteUser) {
        this.deleteUser = deleteUser;
    }

    public LocalDateTime getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public String toString() {
        return "TabAppInfoHis{" +
        "tabHisId=" + tabHisId +
        ", appId=" + appId +
        ", appName=" + appName +
        ", appType=" + appType +
        ", appPath=" + appPath +
        ", appRequestHost=" + appRequestHost +
        ", appRequestServlet=" + appRequestServlet +
        ", appRequestPath=" + appRequestPath +
        ", androidDownloadUrl=" + androidDownloadUrl +
        ", androidPackageName=" + androidPackageName +
        ", androidAppVersion=" + androidAppVersion +
        ", iosDownloadUrl=" + iosDownloadUrl +
        ", iosPackageName=" + iosPackageName +
        ", iosAppVersion=" + iosAppVersion +
        ", subResHost=" + subResHost +
        ", rnBundleKey=" + rnBundleKey +
        ", rnBundleUrlAndroid=" + rnBundleUrlAndroid +
        ", rnBundleUrlIos=" + rnBundleUrlIos +
        ", rnBundleVersion=" + rnBundleVersion +
        ", gReqHost=" + gReqHost +
        ", gReqPath=" + gReqPath +
        ", gResHost=" + gResHost +
        ", resourceUrl=" + resourceUrl +
        ", createTime=" + createTime +
        ", ext1=" + ext1 +
        ", ext2=" + ext2 +
        ", ext3=" + ext3 +
        ", deleteUser=" + deleteUser +
        ", deleteTime=" + deleteTime +
        "}";
    }
}
