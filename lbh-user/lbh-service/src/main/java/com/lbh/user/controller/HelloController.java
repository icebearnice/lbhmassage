package com.lbh.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author: ice
 * Date: 2024/7/22
 */
@RestController
@Slf4j
public class HelloController {
    @RequestMapping("/test")
    public String test(String username, String password) {
        log.info("u==:{},p=={}", username, password);

        return "username==" + username + "hello";
    }
}
