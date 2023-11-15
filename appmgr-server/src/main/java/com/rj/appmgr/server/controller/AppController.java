package com.rj.appmgr.server.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.ObjUtil;
import cn.hutool.core.util.StrUtil;
import com.rj.appmgr.server.biz.connect.IConnectChecker;
import com.rj.appmgr.server.common.ResultCodeEnum;
import com.rj.appmgr.server.dto.BaseResponse;
import com.rj.appmgr.server.dto.NULLBody;
import com.rj.appmgr.server.dto.req.app.CheckConnectReq;
import com.rj.appmgr.server.dto.req.app.DeleteAppReq;
import com.rj.appmgr.server.dto.req.app.GetAppListByAppTypeReq;
import com.rj.appmgr.server.dto.req.app.QueryAppListReq;
import com.rj.appmgr.server.dto.resp.app.QueryAppListResp;
import com.rj.appmgr.server.ms.entity.TabAppInfo;
import com.rj.appmgr.server.ms.entity.TabAppInfoHis;
import com.rj.appmgr.server.ms.entity.TabMenu;
import com.rj.appmgr.server.ms.service.ITabAppInfoHisService;
import com.rj.appmgr.server.ms.service.ITabAppInfoService;
import com.rj.appmgr.server.ms.service.ITabMenuService;
import com.rj.appmgr.server.service.IAppService;
import com.rj.appmgr.server.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@RestController
@RequestMapping(value = "/api")
public class AppController {

    @Autowired
    private ITabAppInfoService tabAppInfoService;

    @Autowired
    private IAppService appService;

    @Autowired
    private IMenuService menuService;

    @Autowired
    private ITabAppInfoHisService tabAppInfoHisService;

    @ApiOperation("分页查询应用列表")
    @RequestMapping(path = "/queryAppList",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<QueryAppListResp> queryAppList(@RequestBody QueryAppListReq queryAppReq){
        BaseResponse<QueryAppListResp> resp = new BaseResponse<>();
        try{
            int pageNumber = queryAppReq.getPageNumber();
            int pageSize = queryAppReq.getPageSize();
            String appType = queryAppReq.getAppType();
            String appName = queryAppReq.getAppName();
            List<TabAppInfo> appInfoList = tabAppInfoService.queryAppList(pageNumber,pageSize,appType,appName);
            if(CollUtil.isEmpty(appInfoList)){
                resp.setInfo("返回结果为空");
            }
            QueryAppListResp appListResp = new QueryAppListResp();
            appListResp.setAppList(appInfoList);
            appListResp.setAppCount(tabAppInfoService.queryTotalActiveApp(appType,appName));
            resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
            resp.setData(appListResp);
        }catch (Exception e){
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo(e.getMessage());
        }finally {
            return resp;
        }
    }

    @ApiOperation("查询应用类型")
    @RequestMapping(path = "queryAppTypeList",method = RequestMethod.GET)
    @ResponseBody
    public BaseResponse<List<Map<String,Object>>> queryAppTypeList(){
        BaseResponse<List<Map<String,Object>>> resp = new BaseResponse<>();
        try{
            List<Map<String,Object>> appTypeList = appService.getAppTypeList();
            appTypeList.stream().forEach(i ->{
                log.info("appTypeList item:{}",i);
            });
            if(CollUtil.isNotEmpty(appTypeList)){
                resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
                resp.setInfo(ResultCodeEnum.RESULT_SUCCESS.getInfo());
                resp.setData(appTypeList);
            }else {
                resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
                resp.setInfo("应用类型为空");
            }
        }catch (Exception e){
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo(e.getMessage());
        }finally {
            return resp;
        }
    }


    @ApiOperation(value = "根据应用类型获取应用列表")
    @RequestMapping(value = "/getAppListByAppType", method = RequestMethod.POST)
    public BaseResponse<List<TabAppInfo>> getAppListByAppType(@RequestBody @ApiParam(value = "查询请求参数", required = true) GetAppListByAppTypeReq req) {
        BaseResponse<List<TabAppInfo>> resp = new BaseResponse<>();
        try {
            List<TabAppInfo> appInfoList = tabAppInfoService.getAppInfoByType(req.getAppType());
            resp.setData(appInfoList);
            resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
        }catch (Exception e) {
            log.error(e.getMessage(), e);
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo("异常为:" + e.getMessage());
        }
        return resp;
    }

    @ApiOperation("新增应用")
    @RequestMapping(path = "/insertApp",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<NULLBody> insertApp(@RequestBody TabAppInfo appInfo){
        appInfo.setCreateTime(LocalDateTime.now());
        BaseResponse resp = new BaseResponse<>();
        boolean isExist = appService.checkAppNameExsit(appInfo.getAppName(),appInfo.getAppId());
        if(isExist){
            resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
            resp.setInfo(appInfo.getAppName() + "应用名已经存在：");
            return resp;
        }
        try {
            boolean result = tabAppInfoService.saveOrUpdate(appInfo);
            log.info("insertApp ,result :" + result);
            if(result){
                resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
                resp.setInfo(ResultCodeEnum.RESULT_SUCCESS.getInfo());
            }else {
                resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
                resp.setInfo(ResultCodeEnum.RESULT_FAIL.getInfo() + "result: " + result);
            }
        }catch (Exception e){
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo("异常为：" + e.getMessage());
        }finally {
            return resp;
        }
    }

    @ApiOperation(value = "应用探测")
    @RequestMapping(value = "/checkConnect", method = RequestMethod.POST)
    public BaseResponse<Map<String,Object>> checkConnect(@RequestBody @ApiParam(value = "应用校验参数", required = true) CheckConnectReq req) {

        BaseResponse resp = new BaseResponse();
        Map<String,Object> result = new HashMap<>();
        try {
            result = check(req);
            resp.setData(result);
            resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
            resp.setInfo( "探测成功");
        } catch (Exception e) {
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo( "探测失败");
            result.put("URL_CONNECTION_CODE", 0);
            resp.setData(result);
            log.error("异常为：", e.getMessage());
        }
        log.info("resp: {}",resp);
        return resp;
    }

    @ApiOperation(value = "编辑应用")
    @RequestMapping(value = "/updateAppById", method = RequestMethod.POST)
    public BaseResponse<TabAppInfo> updateById(@RequestBody @ApiParam(value = "更新的应用信息", required = true) TabAppInfo appInfo){
        BaseResponse resp = new BaseResponse<>();
        try {
            boolean result = tabAppInfoService.saveOrUpdate(appInfo);
            if(result){
                resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
                resp.setInfo("更新成功");
            }else {
                resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
                resp.setInfo("更新失败");
            }
        }catch (Exception e){
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo("异常：" + e.getMessage());
        }finally {
            return resp;
        }
    }

    @ApiOperation(value = "(批量)删除应用")
    @RequestMapping(value = "/deleteAppById", method = RequestMethod.POST)
    public BaseResponse<Map<String,Object>> deleteApp(@RequestBody @ApiParam(value = "删除的应用ID信息", required = true) DeleteAppReq req) {
        log.info("req:" + req.toString());
        String appIds = req.getAppIds();
        log.info("appIds:" + appIds);
        BaseResponse<Map<String,Object>> resp = new BaseResponse<>();
        if(StrUtil.isEmpty(appIds)){
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo("删除失败，应用ID为空");
            return resp;
        }
        //1.删除；2.判断id是否为空；2.1如果有菜单，则不允许直接删除 3.删除成功后 4.将删除成功的id获取appinfo，填入app_his,插入数据
        try{
            String[] ids = appIds.split(",");
            Iterator<String> i = Arrays.stream(ids).iterator();
            List<String> listId = CollUtil.list(false,i);
            List<TabMenu> tabMenuList = menuService.getMenuListWithIds(listId);
            if(CollUtil.isNotEmpty(tabMenuList)){
                resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
                resp.setInfo("删除失败，有绑定应用的菜单");
                return resp;
            }
            List<Map<String,Object>> appInfoList = appService.getAppListWithId(listId);
            appInfoList.forEach(stringObjectMap -> {
                stringObjectMap.put("DELETE_TIME", new Timestamp(System.currentTimeMillis()));
                stringObjectMap.put("DELETE_USER", ObjUtil.isEmpty(stringObjectMap.get("USER_ID")) ? "0000": stringObjectMap.get("USER_ID"));
            });
            List<TabAppInfoHis> appHisList = BeanUtil.copyToList(appInfoList,TabAppInfoHis.class);
            tabAppInfoHisService.saveOrUpdateBatch(appHisList);

            //查询appInfo表是否存在应用
            boolean result = tabAppInfoService.removeBatchByIds(listId);
            if(result){
                resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
                resp.setInfo("删除成功");
            }else {
                resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
                resp.setInfo("删除失败");
            }
        }catch (Exception e){
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo("异常：{}"+ e.getMessage());
        }finally {
            return resp;
        }
    }


    /**
     * 探测应用连接
     *
     * @param params
     * @return
     * @throws Exception
     */
    private Map<String,Object> check(CheckConnectReq params) throws Exception {
        Map<String,Object> resultMap = new HashMap<String,Object>();
        String url = "";
        IConnectChecker checker = IConnectChecker.Type.fromAppType(params.getAppType()).factory.create();
        resultMap = checker.checkConnect(params);

//        if (Constant.APP_TYPE_I.equals(params.get("APP_TYPE"))) {
//            // host+"/"+path+"/"+servlet
//            String requestHost = params.get("APP_REQUEST_HOST").toString();
//            String requestPath = params.get("APP_REQUEST_PATH").toString();
//            String requestServlet = params.get("APP_REQUEST_SERVLET").toString();
//            // 统一去掉参数包含的“/”符号 requestHost包含http:// 不能去掉这个
//            if (requestHost.indexOf("/", requestHost.length() - 1) != -1) {// 说明结尾有"/"符号
//                // 去掉结尾的"/"符号
//                requestHost = requestHost.substring(0, requestHost.lastIndexOf("/"));
//            }
//            requestPath = requestPath.replaceAll("/", "");
//            requestServlet = requestServlet.replaceAll("/", "");
//            // 拼接URL
//            url = requestHost + "/" + requestPath + "/" + requestServlet;
//            resultMap.put("I_CONNECTION_CODE", ConnectionUtil.getConnCode(url));
//        } else if (Constant.APP_TYPE_NATIVE.equals(params.get("APP_TYPE"))) {
//            url = params.get("ANDROID_DOWNLOAD_URL").toString();
//            if (!StrUtil.isEmpty(url)) {
//                resultMap.put("ANDROID_CONNECTION_CODE", ConnectionUtil.getConnCode(url));
//            }
//            url = params.get("IOS_DOWNLOAD_URL").toString();
//            if (!StrUtil.isEmpty(url)) {
//                resultMap.put("IOS_CONNECTION_CODE", ConnectionUtil.getConnCode(url));
//            }
//        } else if (Constant.APP_TYPE_URL.equals(params.get("APP_TYPE"))) {
//            String requestHost = params.get("APP_REQUEST_HOST").toString();
//            String requestPath = params.get("APP_REQUEST_PATH").toString();
//            // 统一去掉参数包含的“/”符号 requestHost包含http:// 不能去掉这个
//            if (requestHost.indexOf("/", requestHost.length() - 1) != -1) {// 说明结尾有"/"符号
//                // 去掉结尾的"/"符号
//                requestHost = requestHost.substring(0, requestHost.lastIndexOf("/"));
//            }
//            requestPath = requestPath.replaceAll("/", "");
//            // 拼接URL
//            url = requestHost + "/" + requestPath;
//            resultMap.put("URL_CONNECTION_CODE", ConnectionUtil.getConnCode(url));
//            return resultMap;
//        } else if (Constant.APP_TYPE_RN.equals(params.get("APP_TYPE"))) {
//            url = params.get("RN_BUNDLE_URL_ANDROID").toString();
//            if (!StrUtil.isEmpty(url)) {
//                resultMap.put("RN_ANDROID_CONNECTION_CODE", ConnectionUtil.getConnCode(url));
//            }
//            url = params.get("RN_BUNDLE_URL_IOS").toString();
//            if (!StrUtil.isEmpty(url)) {
//                resultMap.put("RN_IOS_CONNECTION_CODE", ConnectionUtil.getConnCode(url));
//            }
//        }
//        if (resultMap.isEmpty()) {
//            throw new Exception("探测失败");
//        }

        log.info("resultMap :{}",resultMap);
        return resultMap;
    }

}
