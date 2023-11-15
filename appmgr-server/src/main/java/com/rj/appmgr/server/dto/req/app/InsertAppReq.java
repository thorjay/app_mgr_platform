package com.rj.appmgr.server.dto.req.app;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ApiModel
@Getter
@Setter
@ToString
public class InsertAppReq{

    @ApiModelProperty(value = "应用名称", example = "I秀", required = true)
    private String appName;
    @ApiModelProperty(value = "应用类型", example = "I", required = true)
    private String appType;
    @ApiModelProperty("应用路径")
    private String appPath;
    @ApiModelProperty("应用请求地址")
    private String appRequestHost;
    @ApiModelProperty("请求的servlet")
    private String appRequestServlet;
    @ApiModelProperty("请求的servlet")
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
    @ApiModelProperty("扩展字段1")
    private String ext_1;
    @ApiModelProperty("扩展字段2")
    private String ext_2;
    @ApiModelProperty("扩展字段3")
    private String ext_3;
}
