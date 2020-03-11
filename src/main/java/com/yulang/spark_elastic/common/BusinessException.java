package com.yulang.spark_elastic.common;

import com.yulang.spark_elastic.enums.EmBusinessError;

public class BusinessException extends Exception {

    private CommonError commonError;

    public BusinessException(EmBusinessError emBusinessError){
        super();
        this.commonError = new CommonError(emBusinessError);
    }

    public CommonError getCommonError() {
        return commonError;
    }
}
