package com.rj.appmgr.server.controller;

import com.rj.appmgr.server.dto.BaseResponse;
import com.rj.appmgr.server.ms.entity.TabFence;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j
@SpringBootTest
class FenceControllerTest {

    @Autowired
    private FenceController fenceController;


    @Test
    public void testGetFence(){
        BaseResponse<List<TabFence>> results =  fenceController.getFence();
        log.info("results:{}",results);
    }
}