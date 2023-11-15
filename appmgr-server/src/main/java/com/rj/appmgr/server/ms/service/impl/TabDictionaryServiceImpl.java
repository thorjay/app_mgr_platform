package com.rj.appmgr.server.ms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rj.appmgr.server.ms.entity.TabDictionary;
import com.rj.appmgr.server.ms.mapper.TabDictionaryMapper;
import com.rj.appmgr.server.ms.service.ITabDictionaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@Service
public class TabDictionaryServiceImpl extends ServiceImpl<TabDictionaryMapper, TabDictionary> implements ITabDictionaryService {

    @Autowired
    private TabDictionaryMapper mapper;

    @Override
    public List<TabDictionary> getMenuTypeList() {
        LambdaQueryWrapper<TabDictionary> ew = new LambdaQueryWrapper<TabDictionary>()
                .eq(TabDictionary::getFieldName,"menu_type");
        return mapper.selectList(ew);
    }
}
