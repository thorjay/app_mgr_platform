package com.rj.appmgr.server.dto.resp.app;

import com.rj.appmgr.server.ms.entity.TabAppInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ApiModel
@Getter
@Setter
@ToString
public class QueryAppListResp{

    @ApiModelProperty("数据总条数")
    private long appCount;

    @ApiModelProperty("应用信息列表")
    private List<TabAppInfo> appList;

}
