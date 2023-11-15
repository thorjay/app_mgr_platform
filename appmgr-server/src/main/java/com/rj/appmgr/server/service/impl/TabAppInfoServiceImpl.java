package com.rj.appmgr.server.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rj.appmgr.server.ms.entity.TabAppInfo;
import com.rj.appmgr.server.ms.mapper.TabAppInfoMapper;
import com.rj.appmgr.server.service.ITabAppInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("new_tabAppInfoServiceImpl")//TODO 避免相同类名的bean的命令重复，通过@Autowired时
public class TabAppInfoServiceImpl extends ServiceImpl<TabAppInfoMapper, TabAppInfo> implements ITabAppInfoService {
    @Override
    public Long queryTotalActiveApp(String appType, String appName) {
        return null;
    }

    @Override
    public List<TabAppInfo> queryAppList(int curPage, int pageSize, String appType, String appName) {
        return null;
    }

//    @Autowired
//    private TabAppInfoMapper mapper;
//
//
//    @Override
//    public Long queryTotalActiveApp(String appType, String appName) {
//        LambdaQueryWrapper<TabAppInfo> ew = new QueryWrapper<TabAppInfo>().lambda()
//                .eq(StrUtil.isNotBlank(appType),TabAppInfo::getAppType, appType).eq(StrUtil.isNotBlank(appName),TabAppInfo::getAppName,appName);
//        return mapper.selectCount(ew);
//    }
//
//    public List<TabAppInfo> queryAppList(int curPage, int pageSize, String appType, String appName){
//        return getTabAppInfos(curPage, pageSize, appType, appName, mapper, log);
//    }

}
