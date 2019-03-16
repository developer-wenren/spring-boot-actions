package com.one.swagger.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "响应对象")
public class BaseResult<T> {
    private static final int SUCCESS_CODE = 0;
    private static final String SUCCESS_MESSAGE = "成功";

    @ApiModelProperty(value = "响应码", name = "code", required = true, example = " " + SUCCESS_CODE)
    private int code;
    @ApiModelProperty(value = "响应消息", name = "msg", required = true, example = SUCCESS_MESSAGE)
    private String msg;
    @ApiModelProperty(value = "响应数据", name = "data")
    private T data;


    public static BaseResult successWithData(Object data) {
        BaseResult baseResult = new BaseResult();
        baseResult.setCode(SUCCESS_CODE);
        baseResult.setMsg(SUCCESS_MESSAGE);
        baseResult.setData(data);
        return baseResult;
    }

    public static int getSuccessCode() {
        return SUCCESS_CODE;
    }

    public static String getSuccessMessage() {
        return SUCCESS_MESSAGE;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}