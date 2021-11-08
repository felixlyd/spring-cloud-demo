package com.example.demo32provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liuyaodong
 * @date 2021/11/8
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Demo32ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo32ProviderApplication.class, args);
    }

}
