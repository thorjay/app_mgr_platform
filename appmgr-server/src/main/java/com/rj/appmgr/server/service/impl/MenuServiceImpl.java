package com.rj.appmgr.server.service.impl;

import cn.hutool.core.util.ObjUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rj.appmgr.server.dto.entity.MenuMap;
import com.rj.appmgr.server.mapper.menu.MenuMapper;
import com.rj.appmgr.server.ms.entity.TabCategory;
import com.rj.appmgr.server.ms.entity.TabMenu;
import com.rj.appmgr.server.ms.mapper.TabCategoryMapper;
import com.rj.appmgr.server.ms.mapper.TabMenuMapper;
import com.rj.appmgr.server.service.IMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Slf4j
@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private TabMenuMapper tabMenuMapper;

    @Autowired
    private TabCategoryMapper tabCategoryMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Map<String, Object>> getMenuByCategoryId() {
        List<Map<String,Object>> results = new ArrayList<>();
        //获取category列表
        LambdaQueryWrapper<TabCategory> cateEw = new LambdaQueryWrapper<TabCategory>()
                .select(TabCategory::getId,TabCategory::getName)
                .eq(TabCategory::getState,"1")
                .orderByAsc(TabCategory::getCategorySort);
        List<TabCategory> categories = tabCategoryMapper.selectList(cateEw);
        categories.stream().forEach(tabCategory -> {
            int categoryId = tabCategory.getId();
            //通过categoryId获取menu列表
            LambdaQueryWrapper<TabMenu> menuEw = new LambdaQueryWrapper<TabMenu>()
                    .eq(TabMenu::getCategoryId,categoryId)
                    .orderByAsc(TabMenu::getMenuSort)
                    .orderByDesc(TabMenu::getCreateTime);
            List<TabMenu> menus =  tabMenuMapper.selectList(menuEw);
            Map<String,Object> map = new HashMap<>();
            map.put("ID",tabCategory.getId());
            map.put("name",tabCategory.getName());
            map.put("MENUS",menus);
            results.add(map);
        });
        return results;
    }

    @Override
    public List<MenuMap> getMenuList(String menuName,String menuType,String categoryId,int pageSize,int pageNum) {
        int offSet = (pageNum - 1) * pageSize;
        List result = menuMapper.getMenuMapList(menuName,menuType,categoryId,pageSize,offSet);
        return result;
    }

    @Override
    public Map<String,Object> getMenuListByPage(String menuName, String menuType, String appName, IPage<MenuMap> page) {
        Page<MenuMap> results = menuMapper.getMenuMapListByPage(menuName,menuType,appName,page);
        Map<String,Object> resultMap = new HashMap<>();
        resultMap.put("total",results.getTotal());
        resultMap.put("menuList",results.getRecords());
        return resultMap;
    }

    public List<TabMenu> getMenuListWithIds(List<String> ids){
        LambdaQueryWrapper<TabMenu> ew = new LambdaQueryWrapper<TabMenu>()
                .in(TabMenu::getMenuAppId,ids);
        return tabMenuMapper.selectList(ew);
    }

    @Override
    public boolean checkMenuExist(TabMenu menu) {
        LambdaQueryWrapper<TabMenu> ew = new LambdaQueryWrapper<TabMenu>().eq(ObjUtil.isNotEmpty(menu.getMenuId()),TabMenu::getMenuAppId,menu.getMenuAppId())
                .eq(TabMenu::getMenuName,menu.getMenuName());
        return tabMenuMapper.exists(ew);
    }

    @Override
    public void updateMenuStatus(List<String> ids, Integer status) {
//        Set<String> ids = statusMap.keySet();
        LambdaQueryWrapper<TabMenu> ew = new LambdaQueryWrapper<TabMenu>().in(TabMenu::getMenuId,ids);
        List<TabMenu> menus = tabMenuMapper.selectList(ew);
//        menus.stream().forEach(menu -> {
//            String id = menu.getMenuId().toString();
//            int status = (int) statusMap.get(id);
//            menu.setState(status);
//            tabMenuMapper.updateById(menu);
//        });
        menus.stream().forEach(menu -> {
            log.info("befor update menu info : {}",menu.toString());
            menu.setState(status);
            log.info("after update menu info : {}",menu.toString());
            tabMenuMapper.updateById(menu);
        });
    }

}
