package com.yulang.spark_elastic.common;

import lombok.Data;

public class CommonResponse {

    private String status;
    private Object data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static CommonResponse create(Object data){
        return create(data,"success");
    }

    public static CommonResponse create(Object data,String status){
        CommonResponse res = new CommonResponse();
        res.setData(data);
        res.setStatus(status);
        return res;
    }



}
