package com.rj.appmgr.server.dto.req.app;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@ApiModel
@Getter
@Setter
public class DeleteAppReq{

    @ApiModelProperty(value = "应用ID",required = true)
    private String appIds;
}
