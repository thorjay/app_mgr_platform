package com.rj.appmgr.server.mapper.login;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rj.appmgr.server.dto.req.login.LoginRequest;
import com.rj.appmgr.server.ms.entity.TabSysUser;
import com.rj.appmgr.server.ms.service.ITabSysUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class LoginMapperTest {

    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private ITabSysUserService sysUserService;

    @Test
    public void testSelect(){
        List<LoginRequest> list = loginMapper.selectList(null);
        log.info(list.toString());
    }

    @Test
    public void testQuery(){
        LoginRequest entity = loginMapper.selectOne(new QueryWrapper<LoginRequest>().lambda()
                .eq(LoginRequest::getSysUserAccount,"wangyj18"));
        Assertions.assertEquals("wangyj18",entity.getSysUserPwd());
    }

    @Test
    public void testTabSysUser(){
//        List<TabSysUser> users = sysUserService.list();
//        log.info(users.toString());
        TabSysUser user = sysUserService.getOne(new QueryWrapper<TabSysUser>().lambda().eq(TabSysUser::getSysUserAccount,"wangyj18").eq(TabSysUser::getSysUserPwd,"wangyj18")
                .eq(TabSysUser::getSysUserState,"1"));
        Assertions.assertEquals("wangyj18",user.getSysUserPwd());
    }
}