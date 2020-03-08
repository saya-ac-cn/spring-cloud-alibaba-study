package ac.cn.saya.alibaba.cloud.api.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @Title: PaymentEntity
 * @ProjectName springcloudalibabastudy
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2020-03-07 14:53
 * @Description:
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaymentEntity implements Serializable {

    private static final long serialVersionUID = 6690484192904255731L;

    private Long id;

    private String serial;

}
