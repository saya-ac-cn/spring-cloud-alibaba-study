package ac.cn.saya.payment.provider.repository;

import ac.cn.saya.alibaba.cloud.api.entity.PaymentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Title: PaymentDao
 * @ProjectName springcloudalibabastudy
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2020-03-07 15:03
 * @Description:
 */
@Mapper
public interface PaymentDao {

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
    public PaymentEntity getPaymentById(@Param("id") Long id);

}
