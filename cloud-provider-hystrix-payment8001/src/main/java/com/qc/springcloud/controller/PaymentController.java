package com.qc.springcloud.controller;

import com.qc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qc
 * @create 2020-03-08 21:17
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {
    @Resource
    PaymentService paymentService;
    @RequestMapping("/msg/{id}")
    public String getMsg(@PathVariable("id") Long id){
        return paymentService.getMsg(id);
    }
    @RequestMapping("/lb/{id}")
    public String lb(@PathVariable("id") Long id){
        return "GATE";
    }
    @RequestMapping("/emsg/{id}")
    public String getExceptionMsg(@PathVariable("id") Long id){
        return paymentService.getException(id);
    }
    //===服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String result = paymentService.paymentCircuitBreaker(id);
        log.info("*******result:"+result);
        return result;
    }
}
