package org.example.felixlyd.demo13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author liuyaodong
 * @date 2021/10/12
 */
@SpringBootApplication
public class Demo13Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo13Application.class, args);
    }

    /**
     * 代码方式实现路由转发
     * @param builder 建立路由
     * @return 路由规则
     */
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("hello2", r->r
                        .path("/hello2/**")
                        .uri("http://www.phei.com.cn"))
                .build();
    }

}
