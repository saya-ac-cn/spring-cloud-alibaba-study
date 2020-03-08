package ac.cn.saya.payment.provider.service.impl;

import ac.cn.saya.alibaba.cloud.api.entity.PaymentEntity;
import ac.cn.saya.payment.provider.repository.PaymentDao;
import ac.cn.saya.payment.provider.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Title: PaymentServiceImpl
 * @ProjectName springcloudalibabastudy
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2020-03-07 15:12
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    /**
     * 新增
     *
     * @param payment
     * @return
     */
    @Override
    public int create(PaymentEntity payment) {
        return paymentDao.create(payment);
    }

    /**
     * 根据Id查询
     *
     * @param id
     * @return
     */
    @Override
    public PaymentEntity getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}
