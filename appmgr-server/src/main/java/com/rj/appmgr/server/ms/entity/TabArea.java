package com.rj.appmgr.server.ms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 地市表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_area")
@ApiModel(value = "TabArea对象", description = "地市表")
public class TabArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("地市编号")
    private String areaId;

    @ApiModelProperty("地市名称")
    private String areaDesc;


    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }

    @Override
    public String toString() {
        return "TabArea{" +
        "areaId=" + areaId +
        ", areaDesc=" + areaDesc +
        "}";
    }
}
