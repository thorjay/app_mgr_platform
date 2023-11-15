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
@TableName("tab_hotword_his")
@ApiModel(value = "TabHotwordHis对象", description = "")
public class TabHotwordHis implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "HOTWORD_HIS_ID", type = IdType.AUTO)
    private Integer hotwordHisId;

    @ApiModelProperty("主键")
    private Integer id;

    @ApiModelProperty("热词")
    private String hotword;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("热词排序")
    private Integer hotwordSort;

    @ApiModelProperty("描述")
    private String remark;

    private Integer deleteUser;

    private LocalDateTime deleteTime;


    public Integer getHotwordHisId() {
        return hotwordHisId;
    }

    public void setHotwordHisId(Integer hotwordHisId) {
        this.hotwordHisId = hotwordHisId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotword() {
        return hotword;
    }

    public void setHotword(String hotword) {
        this.hotword = hotword;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getHotwordSort() {
        return hotwordSort;
    }

    public void setHotwordSort(Integer hotwordSort) {
        this.hotwordSort = hotwordSort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDeleteUser() {
        return deleteUser;
    }

    public void setDeleteUser(Integer deleteUser) {
        this.deleteUser = deleteUser;
    }

    public LocalDateTime getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(LocalDateTime deleteTime) {
        this.deleteTime = deleteTime;
    }

    @Override
    public String toString() {
        return "TabHotwordHis{" +
        "hotwordHisId=" + hotwordHisId +
        ", id=" + id +
        ", hotword=" + hotword +
        ", createTime=" + createTime +
        ", hotwordSort=" + hotwordSort +
        ", remark=" + remark +
        ", deleteUser=" + deleteUser +
        ", deleteTime=" + deleteTime +
        "}";
    }
}
