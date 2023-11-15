package com.rj.appmgr.server.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rj.appmgr.server.common.ResultCodeEnum;
import com.rj.appmgr.server.dto.BaseResponse;
import com.rj.appmgr.server.dto.NULLBody;
import com.rj.appmgr.server.dto.req.login.LoginRequest;
import com.rj.appmgr.server.dto.resp.login.LoginResponse;
import com.rj.appmgr.server.ms.entity.TabSysUser;
import com.rj.appmgr.server.ms.service.ITabSysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@Api(tags = "登录接口")
@RequestMapping(value = "/api",consumes = "application/json")
public class LoginController {

    @Autowired
    private ITabSysUserService sysUserService;

    @ApiOperation("登录")
    @RequestMapping(path = "/login",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<LoginResponse> login(@RequestBody LoginRequest req){
        BaseResponse<LoginResponse> resp = new BaseResponse<>();
        log.info("req : {},username : {},password:{}" , req.toString(),req.getSysUserAccount(),req.getSysUserPwd());
        try{
            TabSysUser sysUser = sysUserService.getOne(new QueryWrapper<TabSysUser>().lambda().eq(TabSysUser::getSysUserAccount,req.getSysUserAccount())
                    .eq(TabSysUser::getSysUserState,"1"));
            if(sysUser == null){
                resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
                resp.setInfo("未查询到用户信息");
            }else {
                //TODO 策略模式？
                if(!sysUser.getSysUserPwd().equals(req.getSysUserPwd())){
                    //TODO 密码需要被加密，有一种方案的(微信上)，通过密码sha1值进行对比
                    resp.setCode(ResultCodeEnum.RESULT_FAIL.getCode());
                    resp.setInfo("密码错误");
                }else {
                    log.info("sysUser : {}" , sysUser.toString());
                    //TODO 创建session，保存HTTP登录状态,这里使用JWT+SpringSecruty或Shiro替代
                    resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
                    resp.setInfo(ResultCodeEnum.RESULT_SUCCESS.getInfo());
                    resp.setData(new LoginResponse(sysUser.getSysUserAccount(),sysUser.getSysUserId().toString()));
                }
            }
        }catch (Exception e){
            //TODO 异常统一处理，像成功返回一样，切面
            log.error(e.getMessage(), e);
        }
        return resp;
    }


    @ApiOperation("登出")
    @RequestMapping(path = "/logout",method = RequestMethod.POST)
    @ResponseBody
    public BaseResponse<NULLBody> logout(){
        //TODO 清除Session缓存
        BaseResponse resp = new BaseResponse();
        resp.setCode(ResultCodeEnum.RESULT_SUCCESS.getCode());
        resp.setInfo(ResultCodeEnum.RESULT_SUCCESS.getInfo());
        log.info("退出登录成功");
        return resp;
    }
}
