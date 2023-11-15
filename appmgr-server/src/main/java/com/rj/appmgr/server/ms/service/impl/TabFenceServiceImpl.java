package com.rj.appmgr.server.ms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rj.appmgr.server.ms.entity.TabFence;
import com.rj.appmgr.server.ms.mapper.TabFenceMapper;
import com.rj.appmgr.server.ms.service.ITabFenceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 栏目表 服务实现类
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@Service
public class TabFenceServiceImpl extends ServiceImpl<TabFenceMapper, TabFence> implements ITabFenceService {

    @Autowired
    private TabFenceMapper tabFenceMapper;

    @Override
    public List<TabFence> getFenceList() {
        LambdaQueryWrapper<TabFence> ew = new LambdaQueryWrapper<TabFence>().select(TabFence::getFenceId,TabFence::getFenceName);
        return tabFenceMapper.selectList(ew);
    }


}
