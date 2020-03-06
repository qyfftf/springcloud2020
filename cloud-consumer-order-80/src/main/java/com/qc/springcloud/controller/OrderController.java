package com.qc.springcloud.controller;

import com.qc.springcloud.entity.Payment;
import com.qc.springcloud.entity.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
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
     private static final String url="http://CLOUD-PAYMENT-SERVICE/payment";
     @Resource
     private RestTemplate restTemplate;
     @GetMapping("/consumer/")
     public R create(Payment payment){
          return restTemplate.postForObject(url,payment,R.class);
     }
     @GetMapping("/{id}")
     public R getById(@PathVariable("id") Long id){
          return restTemplate.getForObject(url+"/"+id,R.class);
     }
}
