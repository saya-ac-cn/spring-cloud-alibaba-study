package ac.cn.saya.payment.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: ApplicationContextConfig
 * @ProjectName springcloudalibabastudy
 * @Description: TODO
 * @Author liunengkai
 * @Date: 2020-03-08 09:22
 * @Description:
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    /// 使用自定义负载均衡规则 @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
