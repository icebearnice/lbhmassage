package com.lbh.user.controller;

import com.lbh.user.request.UserRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Author: ice
 * Date: 2024/7/22
 */
@RestController
@Slf4j
@Api(tags = "首页管理")
public class HelloController {
    @GetMapping("/test")
    @ApiOperation(value = "hello接口",notes = "hello接口详细描述")
    public String test(@ApiParam(value = "姓名默认值",example = "实举例，比如张三") @RequestParam(required = false,defaultValue = "姓名默认值 王二") String username,
                       @ApiParam(value = "密码默认值",example = "实举例，比如123") @RequestParam(required = false,defaultValue = "密码默认值 123") String password) {
        log.info("u==:{},p=={}", username, password);

        return "username==" + username + "hello";
    }

    @PostMapping("/addUser")
    @ApiOperation(value = "addUser接口",notes = "addUser接口详细描述")
    public String addUser(@RequestBody UserRequest userRequest) {
        log.info(userRequest.toString());

        return "用户<"+userRequest.getUsername()+">注册成功";
    }


}
