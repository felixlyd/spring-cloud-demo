package com.example.demo32consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuyaodong
 * @date 2021/11/8
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Demo32ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo32ConsumerApplication.class, args);
    }

}
