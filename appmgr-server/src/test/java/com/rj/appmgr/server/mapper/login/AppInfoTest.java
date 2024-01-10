package com.rj.appmgr.server.mapper.login;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mysql.cj.util.StringUtils;
import com.rj.appmgr.server.ms.entity.TabAppInfo;
import com.rj.appmgr.server.ms.mapper.TabAppInfoMapper;
import com.rj.appmgr.server.ms.service.ITabAppInfoService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
public class AppInfoTest {

    @Autowired
    private TabAppInfoMapper tabAppInfoMapper;

    @Autowired
    private ITabAppInfoService tabAppInfoService;

     /**
       *关联表查询
       */
    @Test
    public void testAppInfo(){
       List<TabAppInfo> results =  tabAppInfoMapper.queryAppList();
       log.info(results.toString());
    }


    @Test
    public void testAddApp(){
        TabAppInfo tabAppInfo = new TabAppInfo();
        tabAppInfo.setAppName("测试应用");
        tabAppInfo.setAppType("I");
        int line = tabAppInfoMapper.insert(tabAppInfo);
        log.info("lines:{}",line);
        log.info("appid is {}",tabAppInfo.getAppId() + "");
    }

    @Test
    public void testPage(){
        QueryWrapper<TabAppInfo> appInfoWrapper = new QueryWrapper<TabAppInfo>();
        Page<TabAppInfo> page = new Page<>(1,1);
        page = tabAppInfoMapper.selectPage(page,appInfoWrapper);
        log.info("总记录数：{}",page.getTotal());
        log.info("总共多少页： {}",page.getPages());
        log.info("当前页码: {}",page.getCurrent());
        log.info("customSqlSegment" + appInfoWrapper.getCustomSqlSegment());

        List<TabAppInfo> results = page.getRecords();
        log.info("查询数据:{}",results.toArray());
    }

    public List<TabAppInfo> queryAppPage(String appType,int curPage,int pageSize){
        LambdaQueryWrapper<TabAppInfo> appInfoWrapper = new QueryWrapper<TabAppInfo>().lambda()
                .eq(!StringUtils.isNullOrEmpty(appType),TabAppInfo::getAppType,appType);
        Page<TabAppInfo> page = new Page<>(curPage,pageSize);
        // 注意：一定要手动关闭 SQL 优化，不然查询总数的时候只会查询主表
        page.setOptimizeCountSql(false);
        IPage<TabAppInfo> pageResult = tabAppInfoMapper.queryAppListPage(page,appInfoWrapper);
        log.info("总记录数：:{}",pageResult.getTotal());
        log.info("总共多少页： {}",pageResult.getPages());
        log.info("当前页码: {}",pageResult.getCurrent());

        log.info("customSqlSegment" + appInfoWrapper.getCustomSqlSegment());

        List<TabAppInfo> results = pageResult.getRecords();
        return results;
    }

    @Test
    public void testAppPage(){
        List<TabAppInfo> results = queryAppPage("I",3,5);
        log.info("查询数据 : {}",results.toString());
    }

    @Test
    void queryTotalActiveApp() {
        log.info(tabAppInfoService.queryTotalActiveApp("I","").toString());
    }
}
