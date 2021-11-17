package com.taozi.seckill.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum RespBeanEnum {

    //通用模块
    SUCCESS(200, "SUCCESS"),
    ERROR(500, "服务端异常"),
    //登录模块
    LoginError(500210, "用户名或密码错误"),
    MobileError(500211,"手机号码格式不正确"),
    BindError(500212,"参数校验异常");

    private final Integer code;
    private final String message;
}
