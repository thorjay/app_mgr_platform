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
 * 收藏表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_user_collection")
@ApiModel(value = "TabUserCollection对象", description = "收藏表")
public class TabUserCollection implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "COLLECTION_ID", type = IdType.AUTO)
    private Integer collectionId;

    @ApiModelProperty("用户ID")
    private Integer userId;

    @ApiModelProperty("菜单ID")
    private Integer menuId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("置顶排序，不置顶时，字段值为空")
    private Integer collectionSort;

    @ApiModelProperty("收藏描述")
    private String remark;


    public Integer getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(Integer collectionId) {
        this.collectionId = collectionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Integer getCollectionSort() {
        return collectionSort;
    }

    public void setCollectionSort(Integer collectionSort) {
        this.collectionSort = collectionSort;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TabUserCollection{" +
        "collectionId=" + collectionId +
        ", userId=" + userId +
        ", menuId=" + menuId +
        ", createTime=" + createTime +
        ", collectionSort=" + collectionSort +
        ", remark=" + remark +
        "}";
    }
}
