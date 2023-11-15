package com.rj.appmgr.server.dto.req.menu;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 查询菜单列表请求对象
 */
@ApiModel
@Getter
@Setter
@ToString
public class QueryMenuListReq{
    @ApiModelProperty("菜单名称")
    private String menuName;

    @ApiModelProperty("所属分类")
    private String categoryId;

    @ApiModelProperty("菜单类型")
    private String menuType;

    @ApiModelProperty("当前页数")
    private Integer pageNumber;

    @ApiModelProperty("每页数量")
    private Integer pageSize;

}
