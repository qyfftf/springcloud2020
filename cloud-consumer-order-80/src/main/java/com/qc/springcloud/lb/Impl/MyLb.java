package com.qc.springcloud.lb.Impl;

import com.qc.springcloud.lb.LoaderBalance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author qc
 * @create 2020-03-08 19:11
 */
@Component
public class MyLb implements LoaderBalance {
    /**
     * 访问次数
     */
    private AtomicInteger atomicInteger=new AtomicInteger(0);
    @Override
    public final int getAndIncrement(){
        int current=0;
        int next=0;
        do{
            current=this.atomicInteger.get();//获得当前的访问数
            next=current>=Integer.MAX_VALUE?0:current+1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*****next******"+next);
        return next;
    }


    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index=getAndIncrement()%serviceInstances.size();

        return serviceInstances.get(index);
    }
}
