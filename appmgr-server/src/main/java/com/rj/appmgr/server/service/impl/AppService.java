package com.rj.appmgr.server.service.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ObjUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rj.appmgr.server.ms.entity.TabAppInfo;
import com.rj.appmgr.server.ms.entity.TabDictionary;
import com.rj.appmgr.server.ms.mapper.TabAppInfoMapper;
import com.rj.appmgr.server.ms.mapper.TabDictionaryMapper;
import com.rj.appmgr.server.service.IAppService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class AppService implements IAppService {

    @Autowired
    private TabDictionaryMapper dictionaryMapper;

    @Autowired
    private TabAppInfoMapper tabAppInfoMapper;

    @Override
    public List<Map<String, Object>> getAppTypeList() {
        LambdaQueryWrapper<TabDictionary> ew = new LambdaQueryWrapper<TabDictionary>()
                .eq(TabDictionary::getFieldName,"app_type")
                .select(TabDictionary::getKey,TabDictionary::getValue);
        return dictionaryMapper.selectMaps(ew);
        //xml sql语句执行
//        return dictionaryMapper.queryAppTypeList();
    }

    public boolean checkAppNameExsit(String appName,Integer appId){
        LambdaQueryWrapper<TabAppInfo> ew = new LambdaQueryWrapper<TabAppInfo>()
                .eq(TabAppInfo::getAppName,appName)
                .eq(ObjUtil.isNotEmpty(appId),TabAppInfo::getAppId,appId);
//        LambdaQueryWrapper<TabAppInfo> ew = new LambdaQueryWrapper<TabAppInfo>()
//                .exists("exists(\"select id from table where age = 1\")")
        List<TabAppInfo> appInfoList = tabAppInfoMapper.selectList(ew);
        log.info(appInfoList.toString());
        if(CollUtil.isNotEmpty(appInfoList)){
            return true;
        }
        return false;
    }

    public boolean checkAppPathExsit(String appPath,Integer appId){
        LambdaQueryWrapper<TabAppInfo> ew = new LambdaQueryWrapper<TabAppInfo>()
                .eq(TabAppInfo::getAppPath,appPath)
                .eq(ObjUtil.isEmpty(appId),TabAppInfo::getAppId,appId);
//        LambdaQueryWrapper<TabAppInfo> ew = new LambdaQueryWrapper<TabAppInfo>()
//                .exists("exists(\"select id from table where age = 1\")")
        List<TabAppInfo> appInfoList = tabAppInfoMapper.selectList(ew);
        log.info(appInfoList.toString());
        if(CollUtil.isNotEmpty(appInfoList)){
            return false;
        }
        return true;
    }

    @Override
    public List<Map<String,Object>> getAppListWithId(List<String> ids) {
        List<Integer> idsInt = new ArrayList<>();
        ids.stream().forEach(s -> idsInt.add(Integer.valueOf(s)));
        LambdaQueryWrapper<TabAppInfo> ew = new LambdaQueryWrapper<TabAppInfo>()
                .in(TabAppInfo::getAppId,idsInt);
        return tabAppInfoMapper.selectMaps(ew);
    }

}
