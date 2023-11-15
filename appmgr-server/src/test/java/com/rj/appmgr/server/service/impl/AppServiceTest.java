package com.rj.appmgr.server.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.rj.appmgr.server.ms.entity.TabAppInfo;
import com.rj.appmgr.server.service.IAppService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class AppServiceTest {

    @Autowired
    private IAppService appService;

    @Test
    void getAppTypeList() {
        log.info(appService.getAppTypeList().toString());
    }

    @Test
    void checkAppNameExsit() {
        boolean result = appService.checkAppNameExsit("baidu.com", null);
        Assertions.assertTrue(result);
    }

    @Test
    void checkAppPathExsit() {
        boolean result = appService.checkAppNameExsit("baidu.com", null);
        Assertions.assertTrue(result);
    }

    @Test
    void getAppListWithId() {
        String ids = "1063,1106,1111,1131,1132";
        String[] idArray = ids.split(",");
        Iterator<String> o = Arrays.stream(idArray).iterator();
        List<String> listId = CollUtil.list(false,o);
        log.info("listId : {}",listId);
        List<Map<String, Object>> listApp = appService.getAppListWithId(listId);
        log.info("listApp:{}",listApp);
    }
}