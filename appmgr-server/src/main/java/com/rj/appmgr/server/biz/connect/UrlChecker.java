package com.rj.appmgr.server.biz.connect;

import com.rj.appmgr.server.dto.req.app.CheckConnectReq;
import com.rj.appmgr.server.util.OkHttpUtil;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @desc URL应用，类似公众号
*/
@Slf4j
public class UrlChecker implements IConnectChecker{

    @Override
    public Map<String, Object> checkConnect(CheckConnectReq connectReq) throws Exception {
        Map<String,Object> resultMap = new HashMap<>();
        String requestHost = connectReq.getAppRequestHost();
        String requestPath = connectReq.getAppRequestPath();
        // 统一去掉参数包含的“/”符号 requestHost包含http:// 不能去掉这个
        if (requestHost.indexOf("/", requestHost.length() - 1) != -1) {// 说明结尾有"/"符号
            // 去掉结尾的"/"符号
            requestHost = requestHost.substring(0, requestHost.lastIndexOf("/"));
        }
        requestPath = requestPath.replaceAll("/", "");
        // 拼接URL
        String url = requestHost + "/" + requestPath;
        int connCode = 0;
        try {
            Response response = OkHttpUtil.getInstance().check(url);
            connCode = response.code();
            resultMap.put("URL_CONNECTION_CODE", connCode);
            return resultMap;
        } catch (Exception e) {
            log.error("URL连接失败", e.getMessage());
            throw e;
        }
    }
}
