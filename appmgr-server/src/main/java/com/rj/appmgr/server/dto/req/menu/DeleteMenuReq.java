package com.rj.appmgr.server.dto.req.menu;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 批量删除菜单请求对象
 */
@ApiModel
@Getter
@Setter
@ToString
public class DeleteMenuReq{

    @ApiModelProperty("要删除的菜单Ids，用逗号隔开")
    private String menuIds;
}
