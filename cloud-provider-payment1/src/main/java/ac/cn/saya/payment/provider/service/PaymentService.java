package ac.cn.saya.payment.provider.service;

import ac.cn.saya.alibaba.cloud.api.entity.PaymentEntity;

/**
 * @Title: PaymentService
 * @ProjectName springcloudalibabastudy
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2020-03-07 15:10
 * @Description:
 */

public interface PaymentService {

    /**
     * 新增
     *
     * @param payment
     * @return
     */
    public int create(PaymentEntity payment);

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    public PaymentEntity getPaymentById(Long id);

}
