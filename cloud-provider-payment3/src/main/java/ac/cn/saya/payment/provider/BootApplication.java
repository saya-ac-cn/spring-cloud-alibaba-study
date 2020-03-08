package ac.cn.saya.payment.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Title: BootApplication
 * @ProjectName springcloudalibabastudy
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2020-03-08 13:29
 * @Description:Eureka+Hystrix版提供者
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
    }

}
