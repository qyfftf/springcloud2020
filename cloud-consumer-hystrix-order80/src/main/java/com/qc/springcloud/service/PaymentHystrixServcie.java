package com.qc.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**支付服务的接口
 * @author qc
 * @create 2020-03-09 21:35
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-HYSTRIX-SERVICE",fallback = PaymentFallbackService.class)
public interface PaymentHystrixServcie {
    @RequestMapping("/payment/msg/{id}")
    public String getMsg(@PathVariable("id") Long id);
    @RequestMapping("/payment/emsg/{id}")
    public String getExceptionMsg(@PathVariable("id") Long id);
}
