package com.rj.appmgr.server;

import com.rj.appmgr.server.ms.entity.TabAppInfo;
import com.rj.appmgr.server.ms.mapper.TabAppInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@Slf4j
@SpringBootApplication
@MapperScan({"com.rj.appmgr.server.ms.mapper","com.rj.appmgr.server.mapper"})
public class AppmgrServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppmgrServerApplication.class, args);
    }

}
