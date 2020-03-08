package com.qc.springcloud.service;

import com.qc.springcloud.entity.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author qc
 * @create 2020-03-08 20:12
 */
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeighService {
    @GetMapping("/payment/{id}")
    R getById(@PathVariable("id") Long id);
}
