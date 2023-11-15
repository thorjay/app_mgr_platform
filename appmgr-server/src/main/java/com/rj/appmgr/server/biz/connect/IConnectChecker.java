package com.rj.appmgr.server.biz.connect;

import com.rj.appmgr.server.dto.req.app.CheckConnectReq;
import com.rj.appmgr.server.util.Constant;

import java.io.IOException;
import java.util.Map;

/**
 * @desc 子应用服务探测器
 * @author larryjay
*/
public interface IConnectChecker {

    public enum Type{
        URL(1, Constant.APP_TYPE_URL,UrlChecker::new);
//        NATIVE(),
//        HYBIRD_I(3,Constant.APP_TYPE_I),
//        UNI_APP(),
//        RN(),
//        FLUTTER();

        public final int index;

        public final String appType;

        public final ConnectCheckFunction factory;

        Type(int index, String appType, ConnectCheckFunction factory) {
            this.index = index;
            this.appType = appType;
            this.factory = factory;
        }

        public static Type fromAppType(String appType){
            switch (appType){
                case Constant.APP_TYPE_URL:
                    return URL;
            }
            throw new IllegalArgumentException("未找到应用类别: " + appType);
        }
    }

    public Map<String,Object> checkConnect(CheckConnectReq connectReq) throws Exception;
}
