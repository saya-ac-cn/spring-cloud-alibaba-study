package ac.cn.saya.payment.consumer.service;

import org.springframework.stereotype.Component;

/**
 * @Title: PaymentFallbackService
 * @ProjectName spring-cloud-alibaba-study
 * @Description: TODO
 * @Author liunengkai
 * @Date: 5/5/21 09:50
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentFeignService{

    /**
     * 根据id查询
     *
     * @param id
     * @return
     */
    @Override
    public String getPaymentById(Long id) {
        return "sentinel触发的熔断降级";
    }
}
