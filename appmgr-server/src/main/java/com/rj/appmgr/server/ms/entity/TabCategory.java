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
 * 菜单目录表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_category")
@ApiModel(value = "TabCategory对象", description = "菜单目录表")
public class TabCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("类别名称")
    private String name;

    @ApiModelProperty("状态；0：没上架；1：上架")
    private Integer state;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("排序")
    private Integer categorySort;

    @ApiModelProperty("父目录ID")
    private Integer parentId;

    @ApiModelProperty("父目录名称")
    private String parentName;

    @ApiModelProperty("目录图标")
    private String categoryIcon;

    @ApiModelProperty("类别描述信息")
    private String remark;

    @ApiModelProperty("扩展字段1")
    @TableField("EXT_1")
    private String ext1;

    @ApiModelProperty("扩展字段2")
    @TableField("EXT_2")
    private String ext2;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getCategorySort() {
        return categorySort;
    }

    public void setCategorySort(Integer categorySort) {
        this.categorySort = categorySort;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getCategoryIcon() {
        return categoryIcon;
    }

    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        return "TabCategory{" +
        "id=" + id +
        ", name=" + name +
        ", state=" + state +
        ", createTime=" + createTime +
        ", categorySort=" + categorySort +
        ", parentId=" + parentId +
        ", parentName=" + parentName +
        ", categoryIcon=" + categoryIcon +
        ", remark=" + remark +
        ", ext1=" + ext1 +
        ", ext2=" + ext2 +
        "}";
    }
}
