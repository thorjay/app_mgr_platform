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
 * 栏目历史表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_fence_his")
@ApiModel(value = "TabFenceHis对象", description = "栏目历史表")
public class TabFenceHis implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("栏目历史记录ID")
    @TableId(value = "FENCE_HIS_ID", type = IdType.AUTO)
    private Integer fenceHisId;

    @ApiModelProperty("栏目ID")
    private Integer fenceId;

    @ApiModelProperty("栏目名称")
    private String fenceName;

    @ApiModelProperty("栏目编码")
    private String fenceCode;

    @ApiModelProperty("栏目状态:0：失效；1：有效")
    private Integer state;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("扩展字段1")
    private String ext1;

    @ApiModelProperty("扩展字段2")
    private String ext2;

    private LocalDateTime deleteTime;

    private Integer deleteUser;


    public Integer getFenceHisId() {
        return fenceHisId;
    }

    public void setFenceHisId(Integer fenceHisId) {
        this.fenceHisId = fenceHisId;
    }

    public Integer getFenceId() {
        return fenceId;
    }

    public void setFenceId(Integer fenceId) {
        this.fenceId = fenceId;
    }

    public String getFenceName() {
        return fenceName;
    }

    public void setFenceName(String fenceName) {
        this.fenceName = fenceName;
    }

    public String getFenceCode() {
        return fenceCode;
    }

    public void setFenceCode(String fenceCode) {
        this.fenceCode = fenceCode;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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
        return "TabFenceHis{" +
        "fenceHisId=" + fenceHisId +
        ", fenceId=" + fenceId +
        ", fenceName=" + fenceName +
        ", fenceCode=" + fenceCode +
        ", state=" + state +
        ", createTime=" + createTime +
        ", ext1=" + ext1 +
        ", ext2=" + ext2 +
        ", deleteTime=" + deleteTime +
        ", deleteUser=" + deleteUser +
        "}";
    }
}
