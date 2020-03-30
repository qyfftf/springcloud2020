package com.qc.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author qc
 * @create 2020-03-12 16:37
 */
@Component
public class PaymentFallbackService implements PaymentHystrixServcie{
    @Override
    public String getMsg(Long id) {
        return "okkkkkkkkkkkkkkkkk";
    }

    @Override
    public String getExceptionMsg(Long id) {
        return "errrrrrrrrrrrrrrrr";
    }
}
