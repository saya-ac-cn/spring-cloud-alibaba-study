package ac.cn.saya.payment.provider.controller;

import ac.cn.saya.alibaba.cloud.api.entity.PaymentEntity;
import ac.cn.saya.alibaba.cloud.api.entity.Result;
import ac.cn.saya.payment.provider.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @Title: PaymentController
 * @ProjectName springcloudalibabastudy
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2020-03-07 15:23
 * @Description:
 */
@RestController
@RequestMapping(value = "/payment")
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentService paymentService;

    /**
     * 新增
     * postman http://localhost:8001/payment/create?serial=atguigu002
     *
     * @param payment
     * @return
     */
    @PostMapping(value = "create")
    public Result create(PaymentEntity payment) {
        int result = paymentService.create(payment);
        log.info("*****插入结果: " + result);
        if (result > 0) {
            return new Result(200, "插入数据库成功,serverPort:" + serverPort, result);
        }
        return new Result(500, "插入数据库失败", null);
    }

    /**
     * 查询
     * http://localhost:8001/payment/get/31
     *
     * @param id
     * @return
     */
    @GetMapping(value = "get/{id}")
    public Result getPaymentById(@PathVariable("id") Long id) {
        PaymentEntity payment = paymentService.getPaymentById(id);
        log.info("*****查询结果: " + payment);
        if (payment != null) {
            return new Result(200, "查询成功,serverPort:"+serverPort, payment);
        }
        return new Result(444, "没有对应记录,查询ID:" + id, null);
    }

    @GetMapping(value = "lb")
    public String getPaymentLB() {
        return serverPort;
    }

    @GetMapping(value = "feign/timeout")
    public String paymentFeignTimeout() {
        try {
            // 暂停3秒钟
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "TimeUnit.SECONDS.sleep(3)";
    }

}
