package ac.cn.saya.order.consumer;

import ac.cn.saya.order.rule.SayaRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Title: BootApplication
 * @ProjectName springcloudalibabastudy
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2020-03-07 15:49
 * @Description:主启动类(Eureka版消费者)+Ribbon+RestTemplate
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PROVIDER-PAYMENT1", configuration = SayaRule.class)
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
    }

}
