package com.rj.appmgr.server.ms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户个性化配置表
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@TableName("tab_user_personal_config")
@ApiModel(value = "TabUserPersonalConfig对象", description = "用户个性化配置表")
public class TabUserPersonalConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

    @ApiModelProperty("收藏页面，是否置顶标记位；0：不置顶；1：置顶")
    private Integer favoriteIsTop;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getFavoriteIsTop() {
        return favoriteIsTop;
    }

    public void setFavoriteIsTop(Integer favoriteIsTop) {
        this.favoriteIsTop = favoriteIsTop;
    }

    @Override
    public String toString() {
        return "TabUserPersonalConfig{" +
        "id=" + id +
        ", userId=" + userId +
        ", favoriteIsTop=" + favoriteIsTop +
        "}";
    }
}
