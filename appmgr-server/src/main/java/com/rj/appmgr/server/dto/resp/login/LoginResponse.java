package com.rj.appmgr.server.dto.resp.login;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@ApiModel
@Data
@AllArgsConstructor
public class LoginResponse{

    @ApiModelProperty("用户ID")
    private String userId;
    @ApiModelProperty("用户姓名")
    private String userName;
}
