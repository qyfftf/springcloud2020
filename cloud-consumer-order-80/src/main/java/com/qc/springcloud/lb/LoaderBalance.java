package com.qc.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**自定义负载均衡策略
 * @author qc
 * @create 2020-03-08 18:58
 */
public interface LoaderBalance {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
     int getAndIncrement();


}
