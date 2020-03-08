package ac.cn.saya.payment.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Title: BootApplication
 * @ProjectName springcloudalibabastudy
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2020-03-07 19:57
 * @Description:(Zookeeper版提供者)
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
    }

}
