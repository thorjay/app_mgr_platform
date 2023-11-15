package com.rj.appmgr.server.controller;

import com.rj.appmgr.server.dto.BaseResponse;
import com.rj.appmgr.server.dto.req.app.CheckConnectReq;
import com.rj.appmgr.server.dto.req.app.GetAppListByAppTypeReq;
import com.rj.appmgr.server.ms.mapper.TabAppInfoMapper;
import com.rj.appmgr.server.ms.service.ITabAppInfoService;
import com.rj.appmgr.server.util.Constant;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.bcel.Const;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class AppControllerTest {

    @Autowired
    private TabAppInfoMapper tabAppInfoMapper;

    @Autowired
    private ITabAppInfoService tabAppInfoService;

    @Autowired
    private AppController appController;

    @Test
    void insertApp() {

    }

    @Test
    void getAppListByAppType() {
        GetAppListByAppTypeReq req = new GetAppListByAppTypeReq("N");
        BaseResponse results = appController.getAppListByAppType(req);
        log.info("result:" + results);
    }

    @Test
    void checkConnect() {
        CheckConnectReq req = new CheckConnectReq();
        req.setAppRequestHost("http://www.baidu.com");
        req.setAppRequestPath("/");
        req.setAppType(Constant.APP_TYPE_URL);
        appController.checkConnect(req);
    }
}