package org.example.felixlyd.demo10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liuyaodong
 * @date 2021/10/09
 */
@EnableFeignClients
@SpringBootApplication
public class Demo10Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo10Application.class, args);
    }

}
