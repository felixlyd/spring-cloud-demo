package org.example.felixlyd.demo18gatewayhystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liuyaodong
 * @date 2021/10/12
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Demo18GatewayHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo18GatewayHystrixApplication.class, args);
    }

}
