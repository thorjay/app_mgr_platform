package com.rj.appmgr.server.util;

import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Slf4j
public class OkHttpUtil {
    private static volatile OkHttpUtil instance;

    private OkHttpClient client;

    public OkHttpUtil() {
        this.client = new OkHttpClient().newBuilder().readTimeout(10, TimeUnit.SECONDS).build();;
    }

    public static OkHttpUtil getInstance(){
        if(instance == null){
            synchronized (OkHttpUtil.class){
                if(instance == null){
                    instance = new OkHttpUtil();
                }
            }
        }
        return instance;
    }

    public Response check(String url) throws IOException {
        Request request = new Request.Builder().url(url).build();
        Response response = this.client.newCall(request).execute();
        log.info(response.toString());
        return response;
    }
}
