package com.rj.appmgr.server.ms.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rj.appmgr.server.ms.entity.TabAppInfo;
import com.rj.appmgr.server.ms.mapper.TabAppInfoMapper;
import com.rj.appmgr.server.ms.service.ITabAppInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TabAppInfoServiceImpl extends ServiceImpl<TabAppInfoMapper, TabAppInfo> implements ITabAppInfoService {

    @Autowired
    private TabAppInfoMapper mapper;


    @Override
    public Long queryTotalActiveApp(String appType, String appName) {
        LambdaQueryWrapper<TabAppInfo> ew = new QueryWrapper<TabAppInfo>().lambda()
                .eq(StrUtil.isNotBlank(appType),TabAppInfo::getAppType, appType)
                .eq(StrUtil.isNotBlank(appName),TabAppInfo::getAppName,appName);
        return mapper.selectCount(ew);
    }

    public List<TabAppInfo> queryAppList(int curPage, int pageSize, String appType, String appName){
        return getTabAppInfos(curPage, pageSize, appType, appName, mapper);
    }

    public List<TabAppInfo> getTabAppInfos(int curPage, int pageSize, String appType, String appName, TabAppInfoMapper mapper) {
        LambdaQueryWrapper<TabAppInfo> ew = new QueryWrapper<TabAppInfo>().lambda()
                .eq(StrUtil.isNotBlank(appType),TabAppInfo::getAppType, appType)
                .eq(StrUtil.isNotBlank(appName), TabAppInfo::getAppName,appName);
        Page<TabAppInfo> page = new Page<>(curPage,pageSize);
        IPage<TabAppInfo> pageResult =  mapper.queryAppListPage(page,ew);
        log.info("总页数：{}",pageResult.getPages());
        log.info("总页数：{}",pageResult.getCurrent());
        log.info("总记录数：{}",pageResult.getTotal());
        return pageResult.getRecords();
    }

    public List<TabAppInfo> getAppInfoByType(String  appType){
        LambdaQueryWrapper<TabAppInfo> ew = new QueryWrapper<TabAppInfo>().lambda()
                .eq(TabAppInfo::getAppType, appType);
        return mapper.selectList(ew);
    }


    public int insert(TabAppInfo appInfo){
        return mapper.insert(appInfo);
    }
}
