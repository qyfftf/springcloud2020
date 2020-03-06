package com.qc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author qc
 * @create 2020-03-05 21:50
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMainApp8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMainApp8002.class,args);
    }
}
