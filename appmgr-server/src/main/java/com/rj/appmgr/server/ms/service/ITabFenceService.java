package com.rj.appmgr.server.ms.service;

import com.rj.appmgr.server.ms.entity.TabFence;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 栏目表 服务类
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
public interface ITabFenceService extends IService<TabFence> {

    List<TabFence> getFenceList();

}
