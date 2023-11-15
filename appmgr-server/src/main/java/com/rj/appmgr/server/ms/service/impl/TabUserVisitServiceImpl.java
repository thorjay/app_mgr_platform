package com.rj.appmgr.server.ms.service.impl;

import com.rj.appmgr.server.ms.entity.TabUserVisit;
import com.rj.appmgr.server.ms.mapper.TabUserVisitMapper;
import com.rj.appmgr.server.ms.service.ITabUserVisitService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单访问表-用于统计菜单访问热度 服务实现类
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@Service
public class TabUserVisitServiceImpl extends ServiceImpl<TabUserVisitMapper, TabUserVisit> implements ITabUserVisitService {

}
