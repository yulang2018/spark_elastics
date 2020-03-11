package com.yulang.spark_elastic.enums;

public enum EmBusinessError {

    NO_OBJECT_FOUND(10001,"请求对象不存在")
    ,NUKNOW_ERROR(10002,"未知错误")
    ,NUKNOW_PAGE_HANDLER(10003,"未知路径!");

    private Integer errorCode;

    private String errMsg;

    EmBusinessError(Integer errorCode, String errMsg) {
        this.errorCode = errorCode;
        this.errMsg = errMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
