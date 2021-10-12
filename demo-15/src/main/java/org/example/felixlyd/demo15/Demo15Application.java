package org.example.felixlyd.demo15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liuyaodong
 * @date 2021/10/12
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Demo15Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo15Application.class, args);
    }

}
