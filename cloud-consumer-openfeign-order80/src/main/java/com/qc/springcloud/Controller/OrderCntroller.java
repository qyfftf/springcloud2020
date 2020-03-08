package com.qc.springcloud.Controller;

import com.qc.springcloud.entity.R;
import com.qc.springcloud.service.PaymentFeighService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author qc
 * @create 2020-03-08 20:14
 */
@RestController
@RequestMapping("/order")
public class OrderCntroller {
    @Resource
    private PaymentFeighService paymentFeighService;
    @GetMapping("/{id}")
    public R getById(@PathVariable("id") Long id){
        return paymentFeighService.getById(id);
    }
}
