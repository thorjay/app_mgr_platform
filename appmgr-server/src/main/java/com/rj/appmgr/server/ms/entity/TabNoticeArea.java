package com.rj.appmgr.server.ms.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 公告地市映射表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_notice_area")
@ApiModel(value = "TabNoticeArea对象", description = "公告地市映射表")
public class TabNoticeArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键id")
    private Integer id;

    @ApiModelProperty("公告id")
    private Integer noticeId;

    @ApiModelProperty("地市区域id")
    private Integer areaId;

    @ApiModelProperty("备注")
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TabNoticeArea{" +
        "id=" + id +
        ", noticeId=" + noticeId +
        ", areaId=" + areaId +
        ", remark=" + remark +
        "}";
    }
}
