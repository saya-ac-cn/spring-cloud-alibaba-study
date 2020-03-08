package ac.cn.saya.order.consumer.service;

import ac.cn.saya.alibaba.cloud.api.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Title: PaymentFeignService
 * @ProjectName springcloudalibabastudy
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2020-03-08 11:01
 * @Description:
 */
@Component
@FeignClient(value = "CLOUD-PROVIDER-PAYMENT1")
public interface PaymentFeignService {
    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @GetMapping(value = "payment/get/{id}")
    public Result getPaymentById(@PathVariable("id") Long id);

    /**
     * 模拟feign超时
     *
     * @return
     */
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
