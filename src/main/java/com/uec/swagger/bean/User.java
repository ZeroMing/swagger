package com.uec.swagger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 用户
 * @author: Ming.Lee/李明
 * @create: 2018-11-01 19:35
 **/
@Data
@ApiModel(value = "用户")
public class User {
    @ApiModelProperty(value = "年龄")
    private int age;
    @ApiModelProperty(value = "姓名")
    private String  name;
    @ApiModelProperty(value = "地址")
    private Address address;
}