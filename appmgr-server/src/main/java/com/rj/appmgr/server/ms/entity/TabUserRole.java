package com.rj.appmgr.server.ms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;

/**
 * <p>
 * 
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_user_role")
@ApiModel(value = "TabUserRole对象", description = "")
public class TabUserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "USER_ROLE_ID", type = IdType.AUTO)
    private Integer userRoleId;

    private Integer userId;

    private Integer roleId;

    private LocalDateTime createTime;

    private String remark;


    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
        return "TabUserRole{" +
        "userRoleId=" + userRoleId +
        ", userId=" + userId +
        ", roleId=" + roleId +
        ", createTime=" + createTime +
        ", remark=" + remark +
        "}";
    }
}
