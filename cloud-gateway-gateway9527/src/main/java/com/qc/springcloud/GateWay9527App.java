package com.qc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qc
 * @create 2020-03-14 15:55
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWay9527App {
    public static void main(String[] args) {
        SpringApplication.run(GateWay9527App.class,args);
    }
}
