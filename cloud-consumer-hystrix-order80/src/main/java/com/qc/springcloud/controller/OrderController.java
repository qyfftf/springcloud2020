package com.qc.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.qc.springcloud.entity.Payment;
import com.qc.springcloud.entity.R;
import com.qc.springcloud.service.PaymentHystrixServcie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
 * @author qc
 * @create 2020-03-06 10:02
 */
@RestController
@Slf4j
@RequestMapping("/order")
public class OrderController {
    @Resource
    PaymentHystrixServcie paymentHystrixServcie;
    @RequestMapping("/msg/{id}")
    public String getMsg(@PathVariable("id") Long id){
        return paymentHystrixServcie.getMsg(id);
    }
    @HystrixCommand(fallbackMethod = "timeoutHandler",commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="2000")
    })
    @RequestMapping("/emsg/{id}")
    public String getExceptionMsg(@PathVariable("id") Long id){
        return paymentHystrixServcie.getExceptionMsg(id);
    }
    public String timeoutHandler(@PathVariable("id") Long id){
        return "订单服务调用支付服务超时，请稍后重试";
    }

}
