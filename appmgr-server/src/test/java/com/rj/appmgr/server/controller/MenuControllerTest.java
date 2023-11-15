package com.rj.appmgr.server.controller;

import com.rj.appmgr.server.dto.BaseResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class MenuControllerTest {

    @Autowired
    private MenuController menuController;

    @Test
    void getMenuTypeList() {
        BaseResponse response = menuController.getMenuTypeList();
        log.info(response.toString());
    }

    @Test
    void getMenuCategoryList() {
        BaseResponse resp = menuController.getMenuCategoryList();
        log.info(resp.toString());
    }
}