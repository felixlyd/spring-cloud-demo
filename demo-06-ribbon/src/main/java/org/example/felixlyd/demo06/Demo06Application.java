package org.example.felixlyd.demo06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * @author liuyaodong
 * @date 2021/10/09
 */
@SpringBootApplication
public class Demo06Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo06Application.class, args);
    }
    /**开启客户端负载均衡*/
    @LoadBalanced
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
