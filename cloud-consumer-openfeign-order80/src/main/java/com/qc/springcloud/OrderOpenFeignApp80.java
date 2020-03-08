package com.qc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author qc
 * @create 2020-03-08 20:02
 */
@SpringBootApplication
@EnableFeignClients
public class OrderOpenFeignApp80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignApp80.class);
    }
}
