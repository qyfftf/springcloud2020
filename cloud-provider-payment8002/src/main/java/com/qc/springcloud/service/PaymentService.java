package com.qc.springcloud.service;

import com.qc.springcloud.entity.Payment;

/**
 * @author qc
 * @create 2020-03-05 22:20
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPayentById(Long id);
}
