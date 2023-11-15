package com.rj.appmgr.server.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.rj.appmgr.server.common.ResultCodeEnum;
import com.rj.appmgr.server.dto.BaseResponse;
import com.rj.appmgr.server.ms.entity.TabFence;
import com.rj.appmgr.server.ms.service.ITabFenceService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @desc 栏目Fence相关接口
 * @author larryjay
*/
@Slf4j
@RestController
@RequestMapping(path = "/api")
public class FenceController {

    @Autowired
    private ITabFenceService tabFenceService;

    @ApiOperation(value = "获取栏目（不分页）")
    @RequestMapping(value = "getFence", method = RequestMethod.GET)
    public BaseResponse<List<TabFence>> getFence() {
        BaseResponse<List<TabFence>> resp = new BaseResponse<>();
        try {
            List<TabFence> results = tabFenceService.getFenceList();
            resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
            resp.setData(results);
        } catch (Exception e) {
            resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
            resp.setInfo(e.getMessage());
        } finally {
            return resp;
        }
    }


}
