package com.qc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qc
 * @create 2020-03-09 21:07
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix//开启服务降级功能注解
public class OrderFeignHystrixApp80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrixApp80.class,args);
    }
}
