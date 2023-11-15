package com.rj.appmgr.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.rj.appmgr.server.dto.req.login.LoginRequest;
import com.rj.appmgr.server.mapper.login.LoginMapper;
import com.rj.appmgr.server.service.LoginService;
import com.rj.appmgr.server.util.JacksonUtil;
import org.springframework.beans.factory.annotation.Autowired;


public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Override
    public String login(String acccout,String password) throws Exception {
        LoginRequest entity = loginMapper.selectOne(new LambdaQueryWrapper<LoginRequest>().eq(LoginRequest::getSysUserAccount,acccout)
                .eq(LoginRequest::getSysUserPwd,password));
        return JacksonUtil.getInstance().beanToStr(entity);
    }
}
