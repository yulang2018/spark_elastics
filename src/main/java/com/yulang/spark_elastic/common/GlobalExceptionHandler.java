package com.yulang.spark_elastic.common;

import com.yulang.spark_elastic.enums.EmBusinessError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public CommonResponse doError(Exception e){
        if(e instanceof BusinessException){
            return CommonResponse.create(((BusinessException)e).getCommonError(),"fail");
        }else if(e instanceof NoHandlerFoundException){
            return CommonResponse.create(new CommonError(EmBusinessError.NUKNOW_PAGE_HANDLER),"fail");
        }else{
            return CommonResponse.create(new CommonError(EmBusinessError.NUKNOW_ERROR),"fail");
        }
    }

}
