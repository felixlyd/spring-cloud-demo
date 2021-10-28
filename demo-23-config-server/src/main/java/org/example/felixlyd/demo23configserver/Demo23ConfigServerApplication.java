package org.example.felixlyd.demo23configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author liuyaodong
 * @date 2021/10/28
 */
@EnableConfigServer
@SpringBootApplication
public class Demo23ConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Demo23ConfigServerApplication.class, args);
    }

}
