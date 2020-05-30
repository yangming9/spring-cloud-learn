package com.yangming.cloud.userservice.common.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private T data;
    private String message;
    private Integer code;

    public CommonResult(String message,Integer code){
        this(null,message,code);
    }

    public CommonResult(T data){
        this(data,"操作成功",200);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
