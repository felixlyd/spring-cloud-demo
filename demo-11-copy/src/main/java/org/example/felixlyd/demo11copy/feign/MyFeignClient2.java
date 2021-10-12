package org.example.felixlyd.demo11copy.feign;

import org.example.felixlyd.demo11copy.hystrix.HelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * class MyFeignClient
 * 此类中的方法名称要和远程服务中的方法名称保持一致
 * @author : liuyaodong
 * @date 2021/10/9
 */
@Primary
@FeignClient(name="service-provider", fallback = HelloHystrix.class)
public interface MyFeignClient2 {

    /**
     * 调用服务提供者的接口
     * @return 接口返回值
     */
    @RequestMapping("/hello")
    String hello();
}
