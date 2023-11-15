package com.rj.appmgr.server.ms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
@TableName("tab_sys_user")
@ApiModel(value = "TabSysUser对象", description = "")
public class TabSysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SYS_USER_ID", type = IdType.AUTO)
    private Integer sysUserId;

    @ApiModelProperty("用户账号")
    private String sysUserAccount;

    @ApiModelProperty("用户密码")
    private String sysUserPwd;

    @ApiModelProperty("用户姓名")
    private String sysUserName;

    private String sysUserDept;

    @ApiModelProperty("邮箱")
    private String sysUserMail;

    @ApiModelProperty("电话")
    private String sysUserPhone;

    @ApiModelProperty("状态： 0表示禁用 ，1表示正常")
    private Integer sysUserState;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @TableField(value = "EXT_1")
    private String ext1;

    @TableField(value = "EXT_2")
    private String ext2;


    public Integer getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(Integer sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getSysUserAccount() {
        return sysUserAccount;
    }

    public void setSysUserAccount(String sysUserAccount) {
        this.sysUserAccount = sysUserAccount;
    }

    public String getSysUserPwd() {
        return sysUserPwd;
    }

    public void setSysUserPwd(String sysUserPwd) {
        this.sysUserPwd = sysUserPwd;
    }

    public String getSysUserName() {
        return sysUserName;
    }

    public void setSysUserName(String sysUserName) {
        this.sysUserName = sysUserName;
    }

    public String getSysUserDept() {
        return sysUserDept;
    }

    public void setSysUserDept(String sysUserDept) {
        this.sysUserDept = sysUserDept;
    }

    public String getSysUserMail() {
        return sysUserMail;
    }

    public void setSysUserMail(String sysUserMail) {
        this.sysUserMail = sysUserMail;
    }

    public String getSysUserPhone() {
        return sysUserPhone;
    }

    public void setSysUserPhone(String sysUserPhone) {
        this.sysUserPhone = sysUserPhone;
    }

    public Integer getSysUserState() {
        return sysUserState;
    }

    public void setSysUserState(Integer sysUserState) {
        this.sysUserState = sysUserState;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    @Override
    public String toString() {
        return "TabSysUser{" +
        "sysUserId=" + sysUserId +
        ", sysUserAccount=" + sysUserAccount +
        ", sysUserPwd=" + sysUserPwd +
        ", sysUserName=" + sysUserName +
        ", sysUserDept=" + sysUserDept +
        ", sysUserMail=" + sysUserMail +
        ", sysUserPhone=" + sysUserPhone +
        ", sysUserState=" + sysUserState +
        ", createTime=" + createTime +
        ", ext1=" + ext1 +
        ", ext2=" + ext2 +
        "}";
    }
}
