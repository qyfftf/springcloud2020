package com.qc.springcloud.service.impl;

import com.qc.springcloud.dao.PaymentDao;
import com.qc.springcloud.entity.Payment;
import com.qc.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qc
 * @create 2020-03-05 22:20
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPayentById(Long id) {
        return paymentDao.getPayentById(id);
    }
}
