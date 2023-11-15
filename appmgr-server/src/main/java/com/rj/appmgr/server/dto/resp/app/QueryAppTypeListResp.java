package com.rj.appmgr.server.dto.resp.app;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@ApiModel
@Getter
@Setter
public class QueryAppTypeListResp {

    @ApiModelProperty("应用类型列表")
    private List<Map<String,Object>> appTypeList;
}
