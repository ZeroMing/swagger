package com.uec.swagger.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 分页实体
 * @author: Ming.Lee/李明
 * @create: 2018-11-01 19:29
 **/
@Data
@ApiModel(value = "分页类")
public class Page<T>{
    @ApiModelProperty(value = "总数",notes="总数")
    private Integer toal;
    @ApiModelProperty(value = "数据列表")
    private List<T> data;

}