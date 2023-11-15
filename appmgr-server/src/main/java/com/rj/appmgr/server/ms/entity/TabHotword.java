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
@TableName("tab_hotword")
@ApiModel(value = "TabHotword对象", description = "")
public class TabHotword implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("热词")
    private String hotword;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("热词排序")
    private Integer hotwordSort;

    @ApiModelProperty("描述")
    private String remark;


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

    @Override
    public String toString() {
        return "TabHotword{" +
        "id=" + id +
        ", hotword=" + hotword +
        ", createTime=" + createTime +
        ", hotwordSort=" + hotwordSort +
        ", remark=" + remark +
        "}";
    }
}
