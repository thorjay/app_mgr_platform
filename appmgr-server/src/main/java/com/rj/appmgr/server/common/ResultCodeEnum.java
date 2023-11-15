package com.rj.appmgr.server.common;

/**
 * @desc 业务请求返回结果
 * @author larryjay
 * @since 2023/10/23 16:24
*/
public enum ResultCodeEnum {

    RESULT_SUCCESS("1","返回成功"), RESULT_FAIL("1111","返回失败");

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回信息
     */
    private String info;

    ResultCodeEnum(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
