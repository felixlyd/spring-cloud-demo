package com.example.demo27cloudbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author liuyaodong
 * @date 2021/10/29
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class Demo27CloudBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo27CloudBusApplication.class, args);
    }

}
