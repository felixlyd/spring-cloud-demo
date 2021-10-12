package org.example.felixlyd.demo07;

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
public class Demo07Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo07Application.class, args);
    }

    @LoadBalanced
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
