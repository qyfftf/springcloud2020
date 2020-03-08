package com.qc.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**开启feign的详细日志配置
 * 然后再再yml中配置
 * @author qc
 * @create 2020-03-08 20:30
 */
@Configuration
public class FeignLogConfig {
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
