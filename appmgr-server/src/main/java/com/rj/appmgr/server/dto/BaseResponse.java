package com.rj.appmgr.server.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@ApiModel
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class BaseResponse<T> implements Serializable {

    @ApiModelProperty(value = "响应码", required = true)
    @JsonProperty(value = "RESULT_CODE")
    @NonNull
    private String code;

    @ApiModelProperty(value = "响应消息", required = false)
    @JsonProperty(value = "RESULT_INFO")
    private String info;

    @ApiModelProperty(value = "响应数据", required = false)
    private T data;



}
