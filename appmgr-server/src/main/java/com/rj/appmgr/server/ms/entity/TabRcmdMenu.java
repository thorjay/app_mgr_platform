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
 * 推荐APP
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_rcmd_menu")
@ApiModel(value = "TabRcmdMenu对象", description = "推荐APP")
public class TabRcmdMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "RCMD_ID", type = IdType.AUTO)
    private Integer rcmdId;

    @ApiModelProperty("菜单ID")
    private Integer menuId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("推荐排序")
    private Integer rcmdSort;

    @ApiModelProperty("描述信息")
    private String remark;


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

    @Override
    public String toString() {
        return "TabRcmdMenu{" +
        "rcmdId=" + rcmdId +
        ", menuId=" + menuId +
        ", createTime=" + createTime +
        ", rcmdSort=" + rcmdSort +
        ", remark=" + remark +
        "}";
    }
}
