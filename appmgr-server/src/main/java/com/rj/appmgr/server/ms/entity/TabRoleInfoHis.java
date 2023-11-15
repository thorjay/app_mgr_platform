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
@TableName("tab_role_info_his")
@ApiModel(value = "TabRoleInfoHis对象", description = "")
public class TabRoleInfoHis implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ROLE_HIS_ID", type = IdType.AUTO)
    private Integer roleHisId;

    private Integer roleId;

    @ApiModelProperty("角色名称")
    private String roleName;

    @ApiModelProperty("状态；0：未生效；1：已生效")
    private Integer state;

    @ApiModelProperty("创建人")
    private Integer createUser;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime modifyTime;

    private String remark;

    private LocalDateTime deleteTime;

    private Integer deleteUser;


    public Integer getRoleHisId() {
        return roleHisId;
    }

    public void setRoleHisId(Integer roleHisId) {
        this.roleHisId = roleHisId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
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
        return "TabRoleInfoHis{" +
        "roleHisId=" + roleHisId +
        ", roleId=" + roleId +
        ", roleName=" + roleName +
        ", state=" + state +
        ", createUser=" + createUser +
        ", createTime=" + createTime +
        ", modifyTime=" + modifyTime +
        ", remark=" + remark +
        ", deleteTime=" + deleteTime +
        ", deleteUser=" + deleteUser +
        "}";
    }
}
