package com.example.demo27configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liuyaodong
 * @date 2021/10/29
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Demo27ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo27ConfigClientApplication.class, args);
    }

}
