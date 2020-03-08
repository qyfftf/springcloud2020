package com.qc.myrule;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**自定义轮巡配置 不能放在@ComponentScan所扫描的当前包下以及子包下，
 * 否则我们自定义的这个配置类会被所有的Ribbon客户端所共享，达不到特殊化的目的
 * @author qc
 * @create 2020-03-08 17:59
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }
}

