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
 * 广告表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-25
 */
@TableName("tab_ad_info")
@ApiModel(value = "TabAdInfo对象", description = "广告表")
public class TabAdInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("广告ID")
    @TableId(value = "AD_ID", type = IdType.AUTO)
    private Integer adId;

    @ApiModelProperty("权限ID")
    private Integer adPermsId;

    @ApiModelProperty("广告分类ID")
    private Integer adCategoryId;

    @ApiModelProperty("广告标题")
    private String adTitle;

    @ApiModelProperty("广告描述信息1")
    private String adFirstDesc;

    @ApiModelProperty("广告描述信息2")
    private String adSecondDesc;

    @ApiModelProperty("广告描述信息3")
    private String adThirdDesc;

    @ApiModelProperty("广告图片地址")
    private String adImageUrl;

    @ApiModelProperty("广告类型，I：打开I，U：打开URL，N：打开原生，T：打开本应用页面")
    private String adType;

    @ApiModelProperty("广告类型类型为I时，打开菜单的欢迎页")
    private String adWelcomePage;

    @ApiModelProperty("广告类型类型为I时，菜单的Action名称")
    private String adPageAction;

    @ApiModelProperty("广告类型类型为I时，所属的应用，tab_app_info中的主键")
    private Integer adAppId;

    @ApiModelProperty("广告类型类型为URL时，url地址")
    private String adUrl;

    @ApiModelProperty("Android信息-入口类")
    private String adAndroidMainClass;

    @ApiModelProperty("Android的动态传参")
    private String adAndroidParameter;

    @ApiModelProperty("IOS信息-入口类")
    private String adIosMainClass;

    @ApiModelProperty("广告排序")
    private Integer adSort;

    @ApiModelProperty("状态；A:有效；P:暂停；D:删除；")
    private String state;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty("有效开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty("有效截止时间")
    private LocalDateTime endTime;

    @ApiModelProperty("描述信息")
    private String remark;

    @ApiModelProperty("预留扩展字段1")
    private String ext1;

    @ApiModelProperty("自留扩展字段2")
    private String ext2;

    @ApiModelProperty("创建用户ID")
    private Integer createUserId;


    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public Integer getAdPermsId() {
        return adPermsId;
    }

    public void setAdPermsId(Integer adPermsId) {
        this.adPermsId = adPermsId;
    }

    public Integer getAdCategoryId() {
        return adCategoryId;
    }

    public void setAdCategoryId(Integer adCategoryId) {
        this.adCategoryId = adCategoryId;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public String getAdFirstDesc() {
        return adFirstDesc;
    }

    public void setAdFirstDesc(String adFirstDesc) {
        this.adFirstDesc = adFirstDesc;
    }

    public String getAdSecondDesc() {
        return adSecondDesc;
    }

    public void setAdSecondDesc(String adSecondDesc) {
        this.adSecondDesc = adSecondDesc;
    }

    public String getAdThirdDesc() {
        return adThirdDesc;
    }

    public void setAdThirdDesc(String adThirdDesc) {
        this.adThirdDesc = adThirdDesc;
    }

    public String getAdImageUrl() {
        return adImageUrl;
    }

    public void setAdImageUrl(String adImageUrl) {
        this.adImageUrl = adImageUrl;
    }

    public String getAdType() {
        return adType;
    }

    public void setAdType(String adType) {
        this.adType = adType;
    }

    public String getAdWelcomePage() {
        return adWelcomePage;
    }

    public void setAdWelcomePage(String adWelcomePage) {
        this.adWelcomePage = adWelcomePage;
    }

    public String getAdPageAction() {
        return adPageAction;
    }

    public void setAdPageAction(String adPageAction) {
        this.adPageAction = adPageAction;
    }

    public Integer getAdAppId() {
        return adAppId;
    }

    public void setAdAppId(Integer adAppId) {
        this.adAppId = adAppId;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public String getAdAndroidMainClass() {
        return adAndroidMainClass;
    }

    public void setAdAndroidMainClass(String adAndroidMainClass) {
        this.adAndroidMainClass = adAndroidMainClass;
    }

    public String getAdAndroidParameter() {
        return adAndroidParameter;
    }

    public void setAdAndroidParameter(String adAndroidParameter) {
        this.adAndroidParameter = adAndroidParameter;
    }

    public String getAdIosMainClass() {
        return adIosMainClass;
    }

    public void setAdIosMainClass(String adIosMainClass) {
        this.adIosMainClass = adIosMainClass;
    }

    public Integer getAdSort() {
        return adSort;
    }

    public void setAdSort(Integer adSort) {
        this.adSort = adSort;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
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

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    @Override
    public String toString() {
        return "TabAdInfo{" +
        "adId=" + adId +
        ", adPermsId=" + adPermsId +
        ", adCategoryId=" + adCategoryId +
        ", adTitle=" + adTitle +
        ", adFirstDesc=" + adFirstDesc +
        ", adSecondDesc=" + adSecondDesc +
        ", adThirdDesc=" + adThirdDesc +
        ", adImageUrl=" + adImageUrl +
        ", adType=" + adType +
        ", adWelcomePage=" + adWelcomePage +
        ", adPageAction=" + adPageAction +
        ", adAppId=" + adAppId +
        ", adUrl=" + adUrl +
        ", adAndroidMainClass=" + adAndroidMainClass +
        ", adAndroidParameter=" + adAndroidParameter +
        ", adIosMainClass=" + adIosMainClass +
        ", adSort=" + adSort +
        ", state=" + state +
        ", createTime=" + createTime +
        ", modifyTime=" + modifyTime +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", remark=" + remark +
        ", ext1=" + ext1 +
        ", ext2=" + ext2 +
        ", createUserId=" + createUserId +
        "}";
    }
}
