package com.qc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qc
 * @create 2020-03-06 11:31
 */
@EnableEurekaClient
@SpringBootApplication
public class OrderApp80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp80.class,args);
    }
}
