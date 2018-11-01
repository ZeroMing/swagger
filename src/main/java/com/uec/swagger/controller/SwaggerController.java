package com.uec.swagger.controller;

import com.uec.swagger.bean.Address;
import com.uec.swagger.bean.User;
import com.uec.swagger.common.CommonRest;
import com.uec.swagger.common.Page;
import com.uec.swagger.common.Rest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 测试
 * @author: Ming.Lee/李明
 * @create: 2018-11-01 19:26
 **/
@RestController
@Api(value = "测试控制器")
public class SwaggerController {


    @ApiOperation(value = "获得某个详细信息2")
    @RequestMapping(value = "/complex",method = RequestMethod.POST)
    public Rest<User> testComplex(HttpServletRequest request){
        Rest<User>  rest = new Rest<>();
        List<User> users = new ArrayList<>();
        Address address = new Address();
        address.setCode(1);
        address.setName("北京");
        User user = new User();
        user.setAge(1);
        user.setName("北方");
        user.setAddress(address);
        users.add(user);
        Page<User> page = new Page<>();
        page.setToal(100);
        page.setData(users);
        rest.setCode(200);
        rest.setMessage("success");
        rest.setData(page);
        return rest;
    }




    @ApiOperation(value = "获得某个详细信息2")
    @ApiResponse(code=1,message ="1",response=CommonRest.class)
    @RequestMapping(value = "/complex2",method = RequestMethod.POST)
    public CommonRest<Page<User>> testComplex2(HttpServletRequest request){
        CommonRest<Page<User>>  rest = new CommonRest<>();
        List<User> users = new ArrayList<>();
        Address address = new Address();
        address.setCode(1);
        address.setName("北京");
        User user = new User();
        user.setAge(1);
        user.setName("北方");
        user.setAddress(address);
        users.add(user);
        Page<User> page = new Page<>();
        page.setToal(100);
        page.setData(users);
        rest.setCode(200);
        rest.setMessage("success");
        rest.setData(page);
        return rest;
    }
}