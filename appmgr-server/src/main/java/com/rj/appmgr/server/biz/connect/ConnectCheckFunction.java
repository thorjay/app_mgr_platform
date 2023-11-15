package com.rj.appmgr.server.biz.connect;


@FunctionalInterface
public interface ConnectCheckFunction {

    public IConnectChecker create();
}
