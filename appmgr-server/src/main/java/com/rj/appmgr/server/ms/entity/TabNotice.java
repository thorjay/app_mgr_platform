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
@TableName("tab_notice")
@ApiModel(value = "TabNotice对象", description = "广告表")
public class TabNotice implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("公告ID")
    @TableId(value = "NOTICE_ID", type = IdType.AUTO)
    private Integer noticeId;

    @ApiModelProperty("权限ID")
    private Integer noticePermsId;

    @ApiModelProperty("公告分类枚举值")
    private String noticeCategory;

    @ApiModelProperty("公告标题")
    private String noticeTitle;

    @ApiModelProperty("公告描述信息1")
    private String noticeFirstDesc;

    @ApiModelProperty("公告描述信息2")
    private String noticeSecondDesc;

    @ApiModelProperty("公告描述信息3")
    private String noticeThirdDesc;

    @ApiModelProperty("公告图片地址")
    private String noticeImageUrl;

    @ApiModelProperty("公告类型，I：打开I，U：打开URL，N：打开原生，T：打开本应用页面")
    private String noticeType;

    @ApiModelProperty("公告类型类型为I时，打开菜单的欢迎页")
    private String noticeWelcomePage;

    @ApiModelProperty("公告类型类型为I时，菜单的Action名称")
    private String noticePageAction;

    @ApiModelProperty("公告类型类型为I时，所属的应用，tab_app_info中的主键")
    private Integer appId;

    @ApiModelProperty("公告类型类型为URL时，url地址")
    private String noticeUrl;

    @ApiModelProperty("Android信息-入口类")
    private String noticeAndroidMainClass;

    @ApiModelProperty("Android的动态传参")
    private String noticeAndroidParameter;

    @ApiModelProperty("IOS信息-入口类")
    private String noticeIosMainClass;

    @ApiModelProperty("公告排序")
    private Integer noticeSort;

    @ApiModelProperty("公告附件路径")
    private String noticeFilePath;

    @ApiModelProperty("状态。A:有效；P:暂停；D:删除；")
    private String state;

    @ApiModelProperty("发布人id")
    private Integer createUserId;

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


    public Integer getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Integer noticeId) {
        this.noticeId = noticeId;
    }

    public Integer getNoticePermsId() {
        return noticePermsId;
    }

    public void setNoticePermsId(Integer noticePermsId) {
        this.noticePermsId = noticePermsId;
    }

    public String getNoticeCategory() {
        return noticeCategory;
    }

    public void setNoticeCategory(String noticeCategory) {
        this.noticeCategory = noticeCategory;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeFirstDesc() {
        return noticeFirstDesc;
    }

    public void setNoticeFirstDesc(String noticeFirstDesc) {
        this.noticeFirstDesc = noticeFirstDesc;
    }

    public String getNoticeSecondDesc() {
        return noticeSecondDesc;
    }

    public void setNoticeSecondDesc(String noticeSecondDesc) {
        this.noticeSecondDesc = noticeSecondDesc;
    }

    public String getNoticeThirdDesc() {
        return noticeThirdDesc;
    }

    public void setNoticeThirdDesc(String noticeThirdDesc) {
        this.noticeThirdDesc = noticeThirdDesc;
    }

    public String getNoticeImageUrl() {
        return noticeImageUrl;
    }

    public void setNoticeImageUrl(String noticeImageUrl) {
        this.noticeImageUrl = noticeImageUrl;
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public String getNoticeWelcomePage() {
        return noticeWelcomePage;
    }

    public void setNoticeWelcomePage(String noticeWelcomePage) {
        this.noticeWelcomePage = noticeWelcomePage;
    }

    public String getNoticePageAction() {
        return noticePageAction;
    }

    public void setNoticePageAction(String noticePageAction) {
        this.noticePageAction = noticePageAction;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getNoticeUrl() {
        return noticeUrl;
    }

    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl;
    }

    public String getNoticeAndroidMainClass() {
        return noticeAndroidMainClass;
    }

    public void setNoticeAndroidMainClass(String noticeAndroidMainClass) {
        this.noticeAndroidMainClass = noticeAndroidMainClass;
    }

    public String getNoticeAndroidParameter() {
        return noticeAndroidParameter;
    }

    public void setNoticeAndroidParameter(String noticeAndroidParameter) {
        this.noticeAndroidParameter = noticeAndroidParameter;
    }

    public String getNoticeIosMainClass() {
        return noticeIosMainClass;
    }

    public void setNoticeIosMainClass(String noticeIosMainClass) {
        this.noticeIosMainClass = noticeIosMainClass;
    }

    public Integer getNoticeSort() {
        return noticeSort;
    }

    public void setNoticeSort(Integer noticeSort) {
        this.noticeSort = noticeSort;
    }

    public String getNoticeFilePath() {
        return noticeFilePath;
    }

    public void setNoticeFilePath(String noticeFilePath) {
        this.noticeFilePath = noticeFilePath;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
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

    @Override
    public String toString() {
        return "TabNotice{" +
        "noticeId=" + noticeId +
        ", noticePermsId=" + noticePermsId +
        ", noticeCategory=" + noticeCategory +
        ", noticeTitle=" + noticeTitle +
        ", noticeFirstDesc=" + noticeFirstDesc +
        ", noticeSecondDesc=" + noticeSecondDesc +
        ", noticeThirdDesc=" + noticeThirdDesc +
        ", noticeImageUrl=" + noticeImageUrl +
        ", noticeType=" + noticeType +
        ", noticeWelcomePage=" + noticeWelcomePage +
        ", noticePageAction=" + noticePageAction +
        ", appId=" + appId +
        ", noticeUrl=" + noticeUrl +
        ", noticeAndroidMainClass=" + noticeAndroidMainClass +
        ", noticeAndroidParameter=" + noticeAndroidParameter +
        ", noticeIosMainClass=" + noticeIosMainClass +
        ", noticeSort=" + noticeSort +
        ", noticeFilePath=" + noticeFilePath +
        ", state=" + state +
        ", createUserId=" + createUserId +
        ", createTime=" + createTime +
        ", modifyTime=" + modifyTime +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", remark=" + remark +
        ", ext1=" + ext1 +
        ", ext2=" + ext2 +
        "}";
    }
}
