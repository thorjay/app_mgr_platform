package com.rj.appmgr.server.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rj.appmgr.server.dto.entity.MenuMap;
import com.rj.appmgr.server.mapper.menu.MenuMapper;
import com.rj.appmgr.server.service.IMenuService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class MenuServiceImplTest {

    @Autowired
    private IMenuService menuService;

    @Autowired
    private MenuMapper menuMapper;

    private int i =0;
    @Test
    void getMenuList() {
        LambdaQueryWrapper<MenuMap> queryWrapper = new LambdaQueryWrapper<>();
        Page<MenuMap> page = new Page<>(2,5);
        // 注意：一定要手动关闭 SQL 优化，不然查询总数的时候只会查询主表
        page.setOptimizeCountSql(false);
        Page<MenuMap> pageResult = menuMapper.getMenuMapListByPage(null,null,null,page);
        log.info(pageResult.getRecords().toString());
        List<MenuMap> pageRecords = pageResult.getRecords();

        List<MenuMap> results = menuService.getMenuList(null,null,null,5,2);
        log.info(results.toString());


        results.stream().forEach(menu -> {
            Assertions.assertEquals(menu.getMenuId(),pageRecords.get(i).getMenuId());
            i++;
        });

    }
}