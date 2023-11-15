package com.rj.appmgr.server.ms.mapper;

import com.rj.appmgr.server.ms.entity.TabDictionary;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  字典 Mapper 接口
 * </p>
 *
 * @author larryjay
 * @since 2023-10-24
 */
@Mapper
public interface TabDictionaryMapper extends BaseMapper<TabDictionary> {

    public List<Map<String,Object>> queryAppTypeList();

}
