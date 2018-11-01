package com.uec.swagger.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 结果类
 * @author: Ming.Lee/李明
 * @create: 2018-11-01 19:27
 **/
@Data
@ApiModel(value = "返回类")
public class Rest<T>{
    @ApiModelProperty(value = "返回码：正确0, 警告2，错误为自定义码")
    private int code;
    @ApiModelProperty(value = "返回消息")
    private String message;
    @ApiModelProperty(value = "返回具体内容")
    private Page<T> data;
}