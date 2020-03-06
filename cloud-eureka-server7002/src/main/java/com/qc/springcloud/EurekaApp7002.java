package com.qc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author qc
 * @create 2020-03-06 11:19
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApp7002.class,args);
    }
}
