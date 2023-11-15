package com.rj.appmgr.server.dto.entity;

import com.rj.appmgr.server.ms.entity.TabMenu;
import lombok.Data;
import org.apache.ibatis.annotations.Result;

/**
 * @desc 关联应用信息APP_NAME(TabAppInfo)，功能分类信息CATEGORY_NAME(TabCategory),菜单类别信息(TabDictionary)的 菜单列表
*/
@Data
public class MenuMap extends TabMenu{

    private String categoryName;

    private String menuValue;

    private String appName;
}
