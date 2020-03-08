package ac.cn.saya.order.consumer.controller;

import ac.cn.saya.alibaba.cloud.api.entity.PaymentEntity;
import ac.cn.saya.alibaba.cloud.api.entity.Result;
import ac.cn.saya.order.consumer.lb.SayaLoadBalancer;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Title: OrderController
 * @ProjectName springcloudalibabastudy
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2020-03-07 15:53
 * @Description:
 */
@RestController
@Slf4j
public class OrderController {

    /**
     * 通过在eureka上注册过的微服务名称调用
     */
    public static final String PAYMENT_URL = "http://CLOUD-PROVIDER-PAYMENT1";

    @Resource
    private RestTemplate restTemplate;

    /**
     * 自定义负载均衡规则
     */
    @Resource
    private SayaLoadBalancer loadBalancer;

    @Resource
    private DiscoveryClient discoveryClient;

    /**
     * /consumer/payment/getForEntity/31
     *
     * @param id
     * @return
     */
    @GetMapping("/consumer/payment/getForEntity/{id}")
    public Result<PaymentEntity> getPayment2(@PathVariable("id") Long id) {
        ResponseEntity<Result> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/get/" + id, Result.class);
        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        }
        return new Result<>(500, "操作失败");
    }

    /**
     * 路由规则: 轮询
     * /consumer/payment/payment/lb
     * @return
     */
    @GetMapping(value = "/consumer/payment/lb")
    public String getPaymentLB() {
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT1");
        if (instances == null || instances.size() <= 0) {
            return null;
        }
        ServiceInstance serviceInstance = loadBalancer.instances(instances);
        URI uri = serviceInstance.getUri();
        return restTemplate.getForObject(uri + "/payment/lb", String.class);
    }

}
