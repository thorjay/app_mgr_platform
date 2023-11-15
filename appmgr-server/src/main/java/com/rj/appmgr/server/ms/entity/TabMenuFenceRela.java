package com.rj.appmgr.server.ms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 栏目菜单关系表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_menu_fence_rela")
@ApiModel(value = "TabMenuFenceRela对象", description = "栏目菜单关系表")
public class TabMenuFenceRela implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("关系ID")
    @TableId(value = "RELA_ID", type = IdType.AUTO)
    private Integer relaId;

    @ApiModelProperty("栏目ID")
    private Integer fenceId;

    @ApiModelProperty("菜单ID")
    private Integer menuId;

    @ApiModelProperty("状态:0：失效；1：有效")
    private Integer state;

    @ApiModelProperty("排序")
    private Integer sort;


    public Integer getRelaId() {
        return relaId;
    }

    public void setRelaId(Integer relaId) {
        this.relaId = relaId;
    }

    public Integer getFenceId() {
        return fenceId;
    }

    public void setFenceId(Integer fenceId) {
        this.fenceId = fenceId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "TabMenuFenceRela{" +
        "relaId=" + relaId +
        ", fenceId=" + fenceId +
        ", menuId=" + menuId +
        ", state=" + state +
        ", sort=" + sort +
        "}";
    }
}
