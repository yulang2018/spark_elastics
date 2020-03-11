package com.yulang.spark_elastic.common;

import com.yulang.spark_elastic.enums.EmBusinessError;

public class CommonError {

    private Integer errorCode;

    private String errorMsg;

    public CommonError(EmBusinessError emBusinessError) {
        this.errorCode = emBusinessError.getErrorCode();
        this.errorMsg = emBusinessError.getErrMsg();
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
