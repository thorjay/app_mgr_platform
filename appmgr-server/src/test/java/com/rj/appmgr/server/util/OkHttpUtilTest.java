package com.rj.appmgr.server.util;

import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class OkHttpUtilTest {

    @Test
    void connect() {
        String url = "http://www.baidu.com";
        try {
            Response result = OkHttpUtil.getInstance().check(url);
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    @Test
    void conn(){
        String url = "http://www.163.com";
        try {
            int result = ConnectionUtil.getConnCode(url);
            log.info("result is {}",result);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}