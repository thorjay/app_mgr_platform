package com.rj.appmgr.server.service;

import com.rj.appmgr.server.ms.entity.TabAppInfo;
import com.rj.appmgr.server.ms.entity.TabDictionary;

import java.util.List;
import java.util.Map;

public interface IAppService {

    public List<Map<String,Object>> getAppTypeList();


    public boolean checkAppNameExsit(String appName,Integer appId);

    boolean checkAppPathExsit(String appPath,Integer appId);

    List<Map<String,Object>> getAppListWithId(List<String> ids);
}
