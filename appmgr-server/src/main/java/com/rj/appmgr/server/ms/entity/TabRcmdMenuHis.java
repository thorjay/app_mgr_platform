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
 * 推荐APP历史表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_rcmd_menu_his")
@ApiModel(value = "TabRcmdMenuHis对象", description = "推荐APP历史表")
public class TabRcmdMenuHis implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "RCMD_HIS_ID", type = IdType.AUTO)
    private Integer rcmdHisId;

    @ApiModelProperty("推荐菜单ID")
    private Integer rcmdId;

    @ApiModelProperty("菜单ID")
    private Integer menuId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("推荐排序")
    private Integer rcmdSort;

    @ApiModelProperty("描述信息")
    private String remark;

    @ApiModelProperty("删除时间")
    private LocalDateTime deleteTime;

    @ApiModelProperty("删除用户的ID")
    private Integer deleteUser;


    public Integer getRcmdHisId() {
        return rcmdHisId;
    }

    public void setRcmdHisId(Integer rcmdHisId) {
        this.rcmdHisId = rcmdHisId;
    }

    public Integer getRcmdId() {
        return rcmdId;
    }

    public void setRcmdId(Integer rcmdId) {
        this.rcmdId = rcmdId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getRcmdSort() {
        return rcmdSort;
    }

    public void setRcmdSort(Integer rcmdSort) {
        this.rcmdSort = rcmdSort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return "TabRcmdMenuHis{" +
        "rcmdHisId=" + rcmdHisId +
        ", rcmdId=" + rcmdId +
        ", menuId=" + menuId +
        ", createTime=" + createTime +
        ", rcmdSort=" + rcmdSort +
        ", remark=" + remark +
        ", deleteTime=" + deleteTime +
        ", deleteUser=" + deleteUser +
        "}";
    }
}
