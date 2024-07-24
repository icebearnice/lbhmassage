package com.lbh.massage.user.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Author: ice
 * Date: 2024/7/24
 */
@RestController
@Slf4j
@Api(tags = "登录管理", value = "登录管理相关接口")
public class LoginController {
    /**
     * 手机短信验证接口
     *
     * @param phoneNum 手机号
     * @param imgCode  滑块验证
     */
    @PostMapping("/sendSms")
    @ApiOperation(value = "手机短信验证接口", notes = "通过手机短信验证登录还有滑块验证")
    public void sendSms(@ApiParam(value = "手机号", example = "示例:110") @RequestParam String phoneNum,
                        @ApiParam(value = "滑块验证", example = "1234")  @RequestParam(required = false) String imgCode) {
        log.info("phoneNum=={},imgCode=={}", phoneNum, imgCode);
    }
}
