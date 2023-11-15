package com.rj.appmgr.server.dto.req.app;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.apache.ibatis.annotations.Param;


@ApiModel
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class GetAppListByAppTypeReq{

    @ApiModelProperty(value = "应用类型()", example = "I")
    @NonNull
    private String appType;

}
