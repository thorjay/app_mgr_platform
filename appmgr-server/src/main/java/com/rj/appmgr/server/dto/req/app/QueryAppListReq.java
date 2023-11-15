package com.rj.appmgr.server.dto.req.app;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.lang.Nullable;

/**
 * 查询应用列表请求参数
 */
@Data
public class QueryAppListReq {

    @ApiModelProperty(value = "当前页数", example = "1")
    private Integer pageNumber;

    @ApiModelProperty(value = "每页数量", example = "2")
    private Integer pageSize;

    @ApiModelProperty(value = "应用类型()", example = "I")
    @Nullable
    private String appType;

    @ApiModelProperty(value = "应用名称", example = "I秀")
    @Nullable
    private String appName;

    public Integer getCurrentPage() {
        return (this.pageNumber - 1) * this.pageSize;
    }
}
