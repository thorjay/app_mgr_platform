package com.rj.appmgr.server.mapper.menu;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rj.appmgr.server.dto.entity.MenuMap;
import com.rj.appmgr.server.ms.entity.TabMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper extends BaseMapper<TabMenu> {

    List<MenuMap> getMenuMapList(String menuName,String menuType,String categoryId,int pageSize,int offSet);

    Page<MenuMap> getMenuMapListByPage(String menuName, String menuType, String categoryId, IPage<MenuMap> page);
 }
