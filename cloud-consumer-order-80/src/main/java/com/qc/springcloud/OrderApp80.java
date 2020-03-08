package com.qc.springcloud;

import com.qc.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author qc
 * @create 2020-03-06 11:31
 */
@EnableEurekaClient
@SpringBootApplication
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderApp80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp80.class,args);
    }
}
