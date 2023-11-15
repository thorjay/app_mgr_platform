package com.rj.appmgr.server.dto.req.login;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@TableName(value = "tab_sys_user")
public class LoginRequest {

    @ApiModelProperty(value = "用户名", example = "wangyj18", required = true)
    @TableField(value = "SYS_USER_ACCOUNT")
    private String sysUserAccount;

    @ApiModelProperty(value = "密码", example = "wangyj18", required = true)
    private String sysUserPwd;
}
