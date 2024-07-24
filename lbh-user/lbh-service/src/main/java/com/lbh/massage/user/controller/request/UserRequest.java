package com.lbh.massage.user.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Author: ice
 * Date: 2024/7/23
 */
@Data
@ApiModel(value = "用户注册请求参数", description = "用户注册请求参数")
public class UserRequest {
    @ApiModelProperty(value = "用户名", example = "实列:王二小", required = true)
    private String username;
    @ApiModelProperty(value = "密码", example = "实列:123", required = true)
    private String password;
    @ApiModelProperty(value = "手机号", example = "实列:110", required = true)
    private String phone;
}
