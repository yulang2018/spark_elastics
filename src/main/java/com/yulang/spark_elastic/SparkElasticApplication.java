package com.yulang.spark_elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SparkElasticApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparkElasticApplication.class, args);
    }

}
