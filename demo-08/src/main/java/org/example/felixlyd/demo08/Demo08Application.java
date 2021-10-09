package org.example.felixlyd.demo08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liuyaodong
 * @date 2021/10/09
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class Demo08Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo08Application.class, args);
    }

}
