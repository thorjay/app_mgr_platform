package com.rj.appmgr.server.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rj.appmgr.server.dto.entity.MenuMap;
import com.rj.appmgr.server.ms.entity.TabMenu;

import java.util.List;
import java.util.Map;

public interface IMenuService {


    /**
     * 通过CategoryId获取MenuCategory及对应的Menu列表
     * @return
     */
    List<Map<String,Object>> getMenuByCategoryId();

    List<MenuMap> getMenuList(String menuName,String menuType,String appName,int pageSize,int pageNum);

    Map<String,Object> getMenuListByPage(String menuName, String menuType, String appName, IPage<MenuMap> page);

    List<TabMenu> getMenuListWithIds(List<String> ids);

    boolean checkMenuExist(TabMenu menu);

    void updateMenuStatus(List<String> ids, Integer status);

}
