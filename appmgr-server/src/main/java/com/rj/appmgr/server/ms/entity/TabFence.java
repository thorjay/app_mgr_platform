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
 * 栏目表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_fence")
@ApiModel(value = "TabFence对象", description = "栏目表")
public class TabFence implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("栏目ID")
    @TableId(value = "FENCE_ID", type = IdType.AUTO)
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

    @Override
    public String toString() {
        return "TabFence{" +
        "fenceId=" + fenceId +
        ", fenceName=" + fenceName +
        ", fenceCode=" + fenceCode +
        ", state=" + state +
        ", createTime=" + createTime +
        ", ext1=" + ext1 +
        ", ext2=" + ext2 +
        "}";
    }
}
