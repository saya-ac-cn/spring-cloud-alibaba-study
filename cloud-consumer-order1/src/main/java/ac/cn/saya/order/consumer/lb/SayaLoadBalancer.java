package ac.cn.saya.order.consumer.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Title: SayaLoadBalancer
 * @ProjectName springcloudalibabastudy
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2020-03-08 10:20
 * @Description:
 */

public interface SayaLoadBalancer {

    /**
     * 获取存活的服务实例列表
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
