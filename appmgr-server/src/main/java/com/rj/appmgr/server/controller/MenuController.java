package com.rj.appmgr.server.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rj.appmgr.server.common.ResultCodeEnum;
import com.rj.appmgr.server.dto.BaseResponse;
import com.rj.appmgr.server.dto.entity.MenuMap;
import com.rj.appmgr.server.dto.req.menu.DeleteMenuReq;
import com.rj.appmgr.server.dto.req.menu.QueryMenuListReq;
import com.rj.appmgr.server.dto.req.menu.UpdateMenuStatusReq;
import com.rj.appmgr.server.ms.entity.TabDictionary;
import com.rj.appmgr.server.ms.entity.TabMenu;
import com.rj.appmgr.server.ms.service.ITabDictionaryService;
import com.rj.appmgr.server.ms.service.ITabMenuService;
import com.rj.appmgr.server.service.IMenuService;
import com.rj.appmgr.server.util.Constant;
import com.rj.appmgr.server.util.PinyinUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping(path = "/api")
public class MenuController {

    @Autowired
    private ITabDictionaryService dictionaryService;

    @Autowired
    private IMenuService menuService;

    @Autowired
    private ITabMenuService tabMenuService;

    @ApiOperation(value = "获取菜单类型列表")
    @RequestMapping(value = "getMenuTypeList", method = RequestMethod.GET)
    public BaseResponse<List<TabDictionary>> getMenuTypeList() {
        BaseResponse<List<TabDictionary>> response = new BaseResponse();
        try {
            List<TabDictionary> results = dictionaryService.getMenuTypeList();
            response.setData(results);
            response.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
        }catch (Exception e){
            response.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            response.setInfo("异常：" + e.getMessage());
        }finally {
            return response;
        }
    }



    @ApiOperation(value = "获取菜单所属分类列表")
    @RequestMapping(value = "getMenuCategoryList", method = RequestMethod.GET)
    public BaseResponse<List<Map<String,Object>>> getMenuCategoryList() {
        BaseResponse<List<Map<String,Object>>> resp = new BaseResponse<>();
        try {
            List<Map<String,Object>> results = menuService.getMenuByCategoryId();
            resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
            resp.setData(results);
        }catch (Exception e){
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo("异常："+e.getMessage());
        }finally {
            return resp;
        }
    }
//
//
//    @ApiOperation(value = "获取应用Action列表")
//    @RequestMapping(value = "getActionList", method = RequestMethod.POST)
//
    @ApiOperation(value = "查询菜单列表")
    @RequestMapping(value = "queryMenuList", method = RequestMethod.POST)
    public BaseResponse<Map<String,Object>> getMenuList(@Nullable @RequestBody QueryMenuListReq req){
        BaseResponse<Map<String,Object>> resp = new BaseResponse<>();
        log.info(req.toString());
        try {
            Page<MenuMap> page = new Page<>(req.getPageNumber(),req.getPageSize());
            page.setOptimizeCountSql(false);
            Map<String,Object> resultMap = menuService.getMenuListByPage(req.getMenuName(), req.getMenuType(), req.getCategoryId(),page);
            resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
            resp.setData(resultMap);
        }catch (Exception e){
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo("异常："+e.getMessage());
        }
        finally {
            return resp;
        }
    }

    @ApiOperation(value = "添加菜单")
    @RequestMapping(value = "addMenu", method = RequestMethod.POST)
    public BaseResponse<Map<String,Object>> addMenu(@RequestBody TabMenu menu){
        BaseResponse<Map<String,Object>> resp = new BaseResponse<>();
        log.info(menu.toString());
        if(menuService.checkMenuExist(menu)){
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo("菜单已存在");
            return resp;
        }
        try {
            String menuName = menu.getMenuName();
            menu.setMenuEnName(PinyinUtil.getFirstSpell(menuName));
            menu.setCreateTime(new Timestamp(System.currentTimeMillis()).toLocalDateTime());
            menu.setModifyTime(new Timestamp(System.currentTimeMillis()).toLocalDateTime());
            tabMenuService.save(menu);
            resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
            resp.setInfo(ResultCodeEnum.RESULT_SUCCESS.getInfo());
        }catch (Exception e){
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo("异常为:{}" + e.getMessage());
        }finally {
            return resp;
        }
    }

    @ApiOperation(value = "删除菜单")
    @RequestMapping(value = "deleteMenuByIds", method = RequestMethod.POST)
    public BaseResponse<Map<String,Object>> deleteMenu(@RequestBody DeleteMenuReq req){
        BaseResponse<Map<String,Object>> resp = new BaseResponse<>();
        log.info("DeleteMenuReq:{}",req.toString());
        try {
            String menuIds = req.getMenuIds();
            // 处理结尾有,的情况
            if(StrUtil.isNotEmpty(menuIds)){
                String[] menuIdsArr = menuIds.split(",");
                List<Integer> menuIdList = new ArrayList<>();
                Arrays.stream(menuIdsArr).forEach(s -> {
                    menuIdList.add(Integer.valueOf(s));
                });
                log.info("menuIdList:{}",menuIdList);
                boolean result = tabMenuService.removeBatchByIds(menuIdList);
                if(result){
                    resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
                    resp.setInfo("删除菜单成功");
                }else {
                    resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
                    resp.setInfo("删除菜单失败");
                }
            }else {
                resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
                resp.setInfo("所选删除的应用ID为空");
            }
            return resp;
        }catch (Exception e){
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo("异常为:{}" + e.getMessage());
        }finally {
            return resp;
        }
    }

    @ApiOperation(value = "(批量)更新菜单状态(上下架操作)")
    @RequestMapping(value = "updateMenuStatus", method = RequestMethod.POST)
    public BaseResponse<Map<String,Object>> updateMenuStatus(@RequestBody @ApiParam(value = "更新的菜单ID信息", required = true) UpdateMenuStatusReq req) {
        BaseResponse<Map<String,Object>> resp = new BaseResponse<>();
        try {
            String menuIds = req.getMenuIds();
            if(StrUtil.isNotEmpty(menuIds)){
                String[] idArr = menuIds.split(",");
                List<String> idList = new ArrayList<>();
                Arrays.stream(idArr).forEach(s -> idList.add(s));
                menuService.updateMenuStatus(idList,req.getState());
                resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
                resp.setInfo("更新菜单成功");
            }else {
                resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
                resp.setInfo("菜单id为空");
            }
        }catch (Exception e){
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo("异常为:{}" + e.getMessage());
        }finally {
            return resp;
        }
    }

//
//    @ApiOperation(value = "获取已经上架的所有菜单")
//    @RequestMapping(value = "getMenuOnShelvesList", method = RequestMethod.POST)
//
//    @ApiOperation(value = "获取首页菜单列表")
//    @RequestMapping(value = "getIndexMenus", method = RequestMethod.POST)
}
