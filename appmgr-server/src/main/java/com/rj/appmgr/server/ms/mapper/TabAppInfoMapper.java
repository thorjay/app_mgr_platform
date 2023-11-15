package com.rj.appmgr.server.ms.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rj.appmgr.server.ms.entity.TabAppInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 应用信息表 Mapper 接口
 * </p>
 *
 * @author larryjay
 * @since 2023-10-25
 */
@Mapper
public interface TabAppInfoMapper extends BaseMapper<TabAppInfo> {

    List<TabAppInfo> queryAppList();

    Page<TabAppInfo> queryAppListPage(IPage<TabAppInfo> page, @Param(Constants.WRAPPER) Wrapper<TabAppInfo> queryWrapper);
}
