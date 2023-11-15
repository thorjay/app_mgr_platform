package com.rj.appmgr.server.ms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 栏目菜单关系历史表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_menu_fence_rela_his")
@ApiModel(value = "TabMenuFenceRelaHis对象", description = "栏目菜单关系历史表")
public class TabMenuFenceRelaHis implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("关系历史ID")
    @TableId(value = "RELA_HIS_ID", type = IdType.AUTO)
    private Integer relaHisId;

    @ApiModelProperty("关系ID")
    private Integer relaId;

    @ApiModelProperty("栏目ID")
    private Integer fenceId;

    @ApiModelProperty("菜单ID")
    private Integer menuId;

    @ApiModelProperty("状态:0：失效；1：有效")
    private Integer state;

    @ApiModelProperty("排序")
    private Integer sort;

    private LocalDateTime deleteTime;

    private Integer deleteUser;


    public Integer getRelaHisId() {
        return relaHisId;
    }

    public void setRelaHisId(Integer relaHisId) {
        this.relaHisId = relaHisId;
    }

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

    public LocalDateTime getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getDeleteUser() {
        return deleteUser;
    }

    public void setDeleteUser(Integer deleteUser) {
        this.deleteUser = deleteUser;
    }

    @Override
    public String toString() {
        return "TabMenuFenceRelaHis{" +
        "relaHisId=" + relaHisId +
        ", relaId=" + relaId +
        ", fenceId=" + fenceId +
        ", menuId=" + menuId +
        ", state=" + state +
        ", sort=" + sort +
        ", deleteTime=" + deleteTime +
        ", deleteUser=" + deleteUser +
        "}";
    }
}
