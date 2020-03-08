package com.qc.springcloud.controller;

import com.qc.springcloud.entity.Payment;
import com.qc.springcloud.entity.R;
import com.qc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author qc
 * @create 2020-03-05 22:23
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    String serverport;
    @PostMapping
    public R creat(@RequestBody Payment payment){
        int i = paymentService.create(payment);
        log.info("插入结构{}",i);
        if(i>0){
            return R.ok().message("插入成功");
        }else {
            System.out.println("sss");
            return R.error().message("插入失败");
        }
    }
    @GetMapping("/{id}")
    public R getById(@PathVariable("id") Long id){
        Payment payent = paymentService.getPayentById(id);
        return R.ok().message("查询成功"+serverport).data("payment",payent);
    }
    @GetMapping("/lb")
    public String getByPort(){
        return serverport;
    }
}
