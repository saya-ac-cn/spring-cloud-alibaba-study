package ac.cn.saya.payment.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerOrder5Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder5Application.class, args);
    }

}
