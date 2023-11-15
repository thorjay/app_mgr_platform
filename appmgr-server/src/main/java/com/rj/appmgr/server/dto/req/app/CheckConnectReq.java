package com.rj.appmgr.server.dto.req.app;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel
@Getter
@Setter
public class CheckConnectReq{

    @ApiModelProperty("应用类型")
    private String appType;

    @ApiModelProperty("应用请求地址")
    private String appRequestHost;

    @ApiModelProperty("应用类型")
    private String appRequestPath;

    @ApiModelProperty("请求的servlet")
    private String appRequestServlet;

    @ApiModelProperty("安卓应用下载地址")
    private String androidDownloadUrl;

    @ApiModelProperty("iOS应用下载地址")
    private String iosDownloadUrl;

    @ApiModelProperty("RN:Android资源地址")
    private String rnBundleUrlAndroid;

    @ApiModelProperty("RN:iOS应用下载地址")
    private String rnBundleUrlIos;
}
