package com.rj.appmgr.server.util;


public class Constant {

    /**
     * 数据库链接
     */
    public static final String CONN_NAME = "db_druid";


    public static class Cache {
    }

    public static class Context {
    }

    public static class Session {
        public static final String SESSION_ID = "SESSION_ID";
    }

    /**
     * I类型的应用,即HyBrid应用(LightWebviewBridge应用)
     */
    public static final String APP_TYPE_I = "I";
    /**
     * Native类型的应用
     */
    public static final String APP_TYPE_NATIVE = "N";
    /**
     * URL类型
     */
    public static final String APP_TYPE_URL = "U";
    /**
     * React Native类型
     */
    public static final String APP_TYPE_RN = "R";
    /**
     * 获取server-page.xml数据的action
     */
    public static final String GET_SERVER_PAGE = "getServerPage";

    /**
     * 菜单上架或菜单目录生效
     */
    public static final String STATE_NORMAL = "1";

    /**
     * 菜单下架或菜单目录无效
     */
    public static final String STATE_ABNORMAL = "0";

    /**
     * 超级用户ID
     */
    public static final String SUPER_ROLE_ID = "1";

    // 成功
    public static final String RESP_CODE_SUCCESS = "0000";
    public static final String RESP_MSG_SUCCESS = "操作成功";

    // 失败
    public static final String RESP_CODE_FAIL = "9999";
    public static final String RESP_MSG_FAIL = "操作失败";

    // 登录异常 session对象为空
    public static final String RESP_CODE_SESSION_NULL_FAIL = "4000";
    public static final String RESP_MSG_SESSION_NULL_FAIL = "会话对象为空，请重新登录";

    // 登录异常 userId校验异常
    public static final String RESP_CODE_SESSION_ERROR_FAIL = "4001";
    public static final String RESP_MSG_SESSION_ERROR_FAIL = "非法操作，请重新登录";

    // 自定义消息1
    public static final String RESP_CODE_LOGIN_FAIL = "2001";
    public static final String RESP_MSG_LOGIN_FAIL = "登陆失败,用户名或密码不正确";

    // 自定义消息2
    public static final String RESP_CODE_NO_RECORD = "1001";
    public static final String RESP_MSG_NO_RECORD = "请选择要操作的记录";

    // 自定义消息3
    public static final String RESP_CODE_CATEGORY_HAS_RECORD = "1002";
    public static final String RESP_MSG_CATEGORY_HAS_RECORD = "删除失败，要删除的菜单目录存在关联的菜单";

    // 自定义消息4
    public static final String RESP_CODE_APP_HAS_RECORD = "1003";
    public static final String RESP_MSG_APP_HAS_RECORD = "删除失败，要删除的应用存在关联的菜单";

    // 自定义消息5
    public static final String RESP_CODE_NAME_EXIST = "1004";
    public static final String RESP_MSG_NAME_EXIST = "名称已存在";

    // 自定义消息6
    public static final String RESP_CODE_PATH_EXIST = "1005";
    public static final String RESP_MSG_PATH_EXIST = "路径已存在";

    // 自定义消息7
    public static final String RESP_CODE_TRANSLATE_JSON_WRONG = "3001";
    public static final String RESP_MSG_TRANSLATE_JSON_WRONG = "对象转JSON错误";


}
