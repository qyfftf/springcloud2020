package com.qc.springcloud.controller;

import com.qc.springcloud.entity.Payment;
import com.qc.springcloud.entity.R;
import com.qc.springcloud.lb.LoaderBalance;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

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
     private DiscoveryClient discoveryClient;
     @Resource
     private LoaderBalance loaderBalance;
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
     @GetMapping(value = "/consumer/payment/lb")
     public String paymentLb(){
          List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
          if(instances==null||instances.size()<=0){
               return null;
          }
          ServiceInstance instances1 = loaderBalance.instances(instances);
          URI uri = instances1.getUri();
          return restTemplate.getForObject(uri+"/payment/lb",String.class);
     }
}
