package com.rj.appmgr.server.ms.service;

import com.rj.appmgr.server.ms.entity.TabDictionary;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
public interface ITabDictionaryService extends IService<TabDictionary> {

    public List<TabDictionary> getMenuTypeList();

}
