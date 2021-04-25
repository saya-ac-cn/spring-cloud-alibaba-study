package ac.cn.saya.payment.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Title: ApplicationContextBean
 * @ProjectName spring-cloud-alibaba-study
 * @Description: TODO
 * @Author liunengkai
 * @Date: 4/25/21 22:58
 * @Description:
 */

@Configuration
public class ApplicationContextBean
{
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
