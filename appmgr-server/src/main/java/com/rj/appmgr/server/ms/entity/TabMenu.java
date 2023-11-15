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
 * 菜单表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-25
 */
@TableName("tab_menu")
@ApiModel(value = "TabMenu对象", description = "菜单表")
public class TabMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("菜单ID")
    @TableId(value = "MENU_ID", type = IdType.AUTO)
    private Integer menuId;

    @ApiModelProperty("权限ID")
    @TableField("PERMS_ID")
    private Integer permsId;

    @TableField("CATEGORY_ID")
    private Integer categoryId;

    @ApiModelProperty("菜单名称")
    @TableField("MENU_NAME")
    private String menuName;

    @ApiModelProperty("英文缩写")
    @TableField("MENU_EN_NAME")
    private String menuEnName;

    @ApiModelProperty("菜单图标")
    @TableField("MENU_ICON")
    private String menuIcon;

    @ApiModelProperty("菜单图标颜色")
    @TableField("MENU_COLOR")
    private String menuColor;

    @ApiModelProperty("菜单类型，I：打开I，U：打开URL，N：打开原生")
    @TableField("MENU_TYPE")
    private String menuType;

    @ApiModelProperty("菜单类型类型为I时，打开菜单的欢迎页")
    @TableField("MENU_WELCOME_PAGE")
    private String menuWelcomePage;

    @ApiModelProperty("菜单类型类型为I时，菜单的Action名称")
    @TableField("MENU_PAGE_ACTION")
    private String menuPageAction;

    @ApiModelProperty("菜单类型类型为I时，所属的应用，tab_app_info中的主键")
    @TableField("MENU_APP_ID")
    private Integer menuAppId;

    @ApiModelProperty("菜单类型类型为URL时，url地址")
    @TableField("MENU_URL")
    private String menuUrl;

    @ApiModelProperty("针对URL的子应用菜单入口，打开之前先调用的action的名称，返回到前端的KEY是:ZLWH_CHECK")
    @TableField("MENU_URL_GETPARAM_ACTION")
    private String menuUrlGetparamAction;

    @ApiModelProperty("打开之前先调用的action的参数，参数形式是key:value|key:value，其中key是传入到action的参数的key，value是值，来自session中的key，返回到前端的KEY是:EXT_3")
    @TableField("MENU_URL_GETPARAM_ACTION_PARAM")
    private String menuUrlGetparamActionParam;

    @ApiModelProperty("传入到url菜单中的参数的值，来自action的请求结果中，参数形式是key:value|key:value，其中key是传入到url的参数的key，value是值，来自action中的key的value")
    @TableField("MENU_URL_ACTION_VALUE_PARAM")
    private String menuUrlActionValueParam;

    @ApiModelProperty("固定传入到url菜单中的参数的值，来自session，参数形式是key:value|key:value，其中key是指放到url参数中的key，value是session的key对应的值，返回到前端的KEY是:EXT_4")
    @TableField("MENU_URL_PARAMETER")
    private String menuUrlParameter;

    @ApiModelProperty("Android菜单信息-入口类")
    @TableField("MENU_ANDROID_MAIN_CLASS")
    private String menuAndroidMainClass;

    @ApiModelProperty("Android的动态传参")
    @TableField("MENU_ANDROID_PARAMETER")
    private String menuAndroidParameter;

    @ApiModelProperty("IOS菜单信息-入口类")
    @TableField("MENU_IOS_MAIN_CLASS")
    private String menuIosMainClass;

    @ApiModelProperty("IOS的动态传参")
    @TableField("MENU_IOS_MAIN_PARAMETER")
    private String menuIosMainParameter;

    @ApiModelProperty("RN的页面名")
    @TableField("MENU_RN_PAGE")
    private String menuRnPage;

    @ApiModelProperty("RN的BundleKey")
    @TableField("MENU_RN_BUNDLE_KEY")
    private String menuRnBundleKey;

    @ApiModelProperty("菜单排序")
    @TableField("MENU_SORT")
    private Integer menuSort;

    @ApiModelProperty("状态；0：没上架；1：上架")
    @TableField("STATE")
    private Integer state;

    @ApiModelProperty("创建时间")
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    @ApiModelProperty("修改时间")
    @TableField("MODIFY_TIME")
    private LocalDateTime modifyTime;

    @ApiModelProperty("菜单描述")
    @TableField("REMARK")
    private String remark;

    @ApiModelProperty("状态；1，原生安装打开；2.plugMgr；3.Replugin；4，5..预留 ")
    @TableField("MENU_NATIVE_OPEN_TYPE")
    private String menuNativeOpenType;

    @ApiModelProperty("自定义json参数")
    @TableField("EXTRA_PARAMS")
    private String extraParams;

    @ApiModelProperty("菜单在业务系统中对应的主键值")
    @TableField("MENU_KEY")
    private String menuKey;

    @ApiModelProperty("扩展字段1")
    @TableField("EXT_1")
    private String ext1;

    @ApiModelProperty("扩展字段2")
    @TableField("EXT_2")
    private String ext2;

    @ApiModelProperty("扩展字段3")
    @TableField("EXT_3")
    private String ext3;


    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getPermsId() {
        return permsId;
    }

    public void setPermsId(Integer permsId) {
        this.permsId = permsId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuEnName() {
        return menuEnName;
    }

    public void setMenuEnName(String menuEnName) {
        this.menuEnName = menuEnName;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuColor() {
        return menuColor;
    }

    public void setMenuColor(String menuColor) {
        this.menuColor = menuColor;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuWelcomePage() {
        return menuWelcomePage;
    }

    public void setMenuWelcomePage(String menuWelcomePage) {
        this.menuWelcomePage = menuWelcomePage;
    }

    public String getMenuPageAction() {
        return menuPageAction;
    }

    public void setMenuPageAction(String menuPageAction) {
        this.menuPageAction = menuPageAction;
    }

    public Integer getMenuAppId() {
        return menuAppId;
    }

    public void setMenuAppId(Integer menuAppId) {
        this.menuAppId = menuAppId;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuUrlGetparamAction() {
        return menuUrlGetparamAction;
    }

    public void setMenuUrlGetparamAction(String menuUrlGetparamAction) {
        this.menuUrlGetparamAction = menuUrlGetparamAction;
    }

    public String getMenuUrlGetparamActionParam() {
        return menuUrlGetparamActionParam;
    }

    public void setMenuUrlGetparamActionParam(String menuUrlGetparamActionParam) {
        this.menuUrlGetparamActionParam = menuUrlGetparamActionParam;
    }

    public String getMenuUrlActionValueParam() {
        return menuUrlActionValueParam;
    }

    public void setMenuUrlActionValueParam(String menuUrlActionValueParam) {
        this.menuUrlActionValueParam = menuUrlActionValueParam;
    }

    public String getMenuUrlParameter() {
        return menuUrlParameter;
    }

    public void setMenuUrlParameter(String menuUrlParameter) {
        this.menuUrlParameter = menuUrlParameter;
    }

    public String getMenuAndroidMainClass() {
        return menuAndroidMainClass;
    }

    public void setMenuAndroidMainClass(String menuAndroidMainClass) {
        this.menuAndroidMainClass = menuAndroidMainClass;
    }

    public String getMenuAndroidParameter() {
        return menuAndroidParameter;
    }

    public void setMenuAndroidParameter(String menuAndroidParameter) {
        this.menuAndroidParameter = menuAndroidParameter;
    }

    public String getMenuIosMainClass() {
        return menuIosMainClass;
    }

    public void setMenuIosMainClass(String menuIosMainClass) {
        this.menuIosMainClass = menuIosMainClass;
    }

    public String getMenuIosMainParameter() {
        return menuIosMainParameter;
    }

    public void setMenuIosMainParameter(String menuIosMainParameter) {
        this.menuIosMainParameter = menuIosMainParameter;
    }

    public String getMenuRnPage() {
        return menuRnPage;
    }

    public void setMenuRnPage(String menuRnPage) {
        this.menuRnPage = menuRnPage;
    }

    public String getMenuRnBundleKey() {
        return menuRnBundleKey;
    }

    public void setMenuRnBundleKey(String menuRnBundleKey) {
        this.menuRnBundleKey = menuRnBundleKey;
    }

    public Integer getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
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

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMenuNativeOpenType() {
        return menuNativeOpenType;
    }

    public void setMenuNativeOpenType(String menuNativeOpenType) {
        this.menuNativeOpenType = menuNativeOpenType;
    }

    public String getExtraParams() {
        return extraParams;
    }

    public void setExtraParams(String extraParams) {
        this.extraParams = extraParams;
    }

    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
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

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    @Override
    public String toString() {
        return "TabMenu{" +
        "menuId=" + menuId +
        ", permsId=" + permsId +
        ", categoryId=" + categoryId +
        ", menuName=" + menuName +
        ", menuEnName=" + menuEnName +
        ", menuIcon=" + menuIcon +
        ", menuColor=" + menuColor +
        ", menuType=" + menuType +
        ", menuWelcomePage=" + menuWelcomePage +
        ", menuPageAction=" + menuPageAction +
        ", menuAppId=" + menuAppId +
        ", menuUrl=" + menuUrl +
        ", menuUrlGetparamAction=" + menuUrlGetparamAction +
        ", menuUrlGetparamActionParam=" + menuUrlGetparamActionParam +
        ", menuUrlActionValueParam=" + menuUrlActionValueParam +
        ", menuUrlParameter=" + menuUrlParameter +
        ", menuAndroidMainClass=" + menuAndroidMainClass +
        ", menuAndroidParameter=" + menuAndroidParameter +
        ", menuIosMainClass=" + menuIosMainClass +
        ", menuIosMainParameter=" + menuIosMainParameter +
        ", menuRnPage=" + menuRnPage +
        ", menuRnBundleKey=" + menuRnBundleKey +
        ", menuSort=" + menuSort +
        ", state=" + state +
        ", createTime=" + createTime +
        ", modifyTime=" + modifyTime +
        ", remark=" + remark +
        ", menuNativeOpenType=" + menuNativeOpenType +
        ", extraParams=" + extraParams +
        ", menuKey=" + menuKey +
        ", ext1=" + ext1 +
        ", ext2=" + ext2 +
        ", ext3=" + ext3 +
        "}";
    }
}
