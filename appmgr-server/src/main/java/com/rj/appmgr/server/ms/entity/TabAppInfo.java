package com.rj.appmgr.server.ms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 * 应用信息表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-25
 */
@TableName("tab_app_info")
@ApiModel(value = "TabAppInfo对象", description = "应用信息表")
public class TabAppInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("表主键")
    @TableId(value = "APP_ID", type = IdType.AUTO)
    private Integer appId;

    @ApiModelProperty("应用名称")
    private String appName;

    @ApiModelProperty("应用类型")
    private String appType;

    @ApiModelProperty("APP_PATH")
    private String appPath;

    @ApiModelProperty("请求地址")
    private String appRequestHost;

    @ApiModelProperty("请求的servlet")
    private String appRequestServlet;

    @ApiModelProperty("请求路径")
    private String appRequestPath;

    @ApiModelProperty("Android应用基础信息-资源地址")
    private String androidDownloadUrl;

    @ApiModelProperty("Android应用基础信息-应用唯一标识")
    private String androidPackageName;

    @ApiModelProperty("Android应用的版本号")
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


    @DateTimeFormat(pattern = "yyyy_MM_dd HH:mm:ss")
    private LocalDateTime createTime;

    @ApiModelProperty("扩展字段1")
    @TableField(value = "EXT_1")
    private String ext1;

    @ApiModelProperty("扩展字段2")
    @TableField(value = "EXT_2")
    private String ext2;

    @ApiModelProperty("扩展字段3")
    @TableField(value = "EXT_3")
    private String ext3;


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

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
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

    @Override
    public String toString() {
        return "TabAppInfo{" +
        "appId=" + appId +
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
        "}";
    }
}
