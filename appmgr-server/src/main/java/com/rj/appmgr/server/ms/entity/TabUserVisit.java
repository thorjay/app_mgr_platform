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
 * 菜单访问表-用于统计菜单访问热度
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_user_visit")
@ApiModel(value = "TabUserVisit对象", description = "菜单访问表-用于统计菜单访问热度")
public class TabUserVisit implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("访问的菜单ID")
    private Integer menuId;

    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("描述")
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TabUserVisit{" +
        "id=" + id +
        ", menuId=" + menuId +
        ", userId=" + userId +
        ", createTime=" + createTime +
        ", remark=" + remark +
        "}";
    }
}
