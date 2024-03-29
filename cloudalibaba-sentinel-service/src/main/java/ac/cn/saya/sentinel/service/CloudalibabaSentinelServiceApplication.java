package ac.cn.saya.sentinel.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudalibabaSentinelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudalibabaSentinelServiceApplication.class, args);
    }

}
