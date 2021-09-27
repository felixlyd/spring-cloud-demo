package com.example.felixlyd.feignclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * interface MyFeignClient
 *
 * @author : liuyaodong
 * @date 2021/9/27
 */
@FeignClient(name="eureka-client")
public interface MyFeignClient {
    /**
     * 调用服务提供者的接口
     * @return 调用服务提供者的接口
     */
    @RequestMapping(value="/hello")
    String hello();
}
