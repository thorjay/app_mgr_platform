package com.rj.appmgr.server.dto.req.menu;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 批量更新菜单转态请求对象
 */
@ApiModel
@Getter
@Setter
@ToString
public class UpdateMenuStatusReq{

    @ApiModelProperty(value="要更新的菜单Ids，用逗号隔开")
    private String menuIds;

    @ApiModelProperty(value="状态；0：没上架；1：上架")
    private int state;
}
