package com.jzo2o.api.foundations.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 服务项简略响应值
 *
 * @author itcast
 * @create 2023/7/4 11:53
 **/
@Data
@ApiModel("服务项简略响应值")
public class ServeItemSimpleDTO {

    /**
     * 主键
     */
    @ApiModelProperty("主键")
    private Long serveItemId;

    /**
     * 服务名称
     */
    @ApiModelProperty("服务名称")
    private String serveItemName;
}
