package com.qc.springcloud.dao;

import com.qc.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author qc
 * @create 2020-03-05 22:09
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPayentById(@Param("id") Long id);
}
