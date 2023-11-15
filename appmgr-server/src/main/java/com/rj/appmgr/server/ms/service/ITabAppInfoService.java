package com.rj.appmgr.server.ms.service;

import com.rj.appmgr.server.ms.entity.TabAppInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rj.appmgr.server.ms.mapper.TabAppInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 * 应用信息表 服务类
 * </p>
 *
 * @author larryjay
 * @since 2023-10-25
 */
public interface ITabAppInfoService extends IService<TabAppInfo> {

    /**
     * 生效的应用总数
     */
    public Long queryTotalActiveApp(String appType, String appName);

    public List<TabAppInfo> queryAppList(int curPage, int pageSize, String appType, String appName);

    public int insert(TabAppInfo appInfo);

    public List<TabAppInfo> getAppInfoByType(String  appType);

}
