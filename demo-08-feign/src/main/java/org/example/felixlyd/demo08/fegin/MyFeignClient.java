package org.example.felixlyd.demo08.fegin;

import feign.RequestLine;
import org.example.felixlyd.demo08.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2021/10/9
 */
@FeignClient(contextId = "feignClient", name="service-provider", configuration = FeignConfig.class)
public interface MyFeignClient {
    /**
     * Spring MVC注解修改为Feign原生的注解@RequestLine
     * 如果没启动feign.Contract.Default，就是 @GetMapping("/hello")
     * @return 调用服务提供者的接口
     *
     */
    @RequestLine("GET /hello")
    String hello();
}
