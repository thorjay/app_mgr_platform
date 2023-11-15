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
 * 
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_role_perms")
@ApiModel(value = "TabRolePerms对象", description = "")
public class TabRolePerms implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ROLE_PERMS_ID", type = IdType.AUTO)
    private Integer rolePermsId;

    @ApiModelProperty("角色ID")
    private Integer roleId;

    @ApiModelProperty("菜单ID")
    private Integer menuId;

    private LocalDateTime createTime;

    private String remark;


    public Integer getRolePermsId() {
        return rolePermsId;
    }

    public void setRolePermsId(Integer rolePermsId) {
        this.rolePermsId = rolePermsId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TabRolePerms{" +
        "rolePermsId=" + rolePermsId +
        ", roleId=" + roleId +
        ", menuId=" + menuId +
        ", createTime=" + createTime +
        ", remark=" + remark +
        "}";
    }
}
