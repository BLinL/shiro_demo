package com.bliu.sd.common;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum StatusCode {
    OK(1,"成功"),
    FAIL(2,"失败"),
    USER_NOT_FOUND_ERR(4,"用户未找到"),
    USERNAME_OR_PASSWORD_ERR(5,"用户名或密码错误"),
    USER_NOT_PERMITTED_ERR(6,"无权限访问"),
    USER_LOCKED_ERR(7,"用户已被锁定");

    @Setter
    private String msg;

    @Setter
    private int code;

    StatusCode(int code,String msg){
        this.code = code;
        this.msg = msg;
    }
}
