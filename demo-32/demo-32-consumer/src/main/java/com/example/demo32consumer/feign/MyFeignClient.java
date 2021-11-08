package com.example.demo32consumer.feign;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * class FeignClient
 *
 * @author : liuyaodong
 * @date 2021/11/8
 */
@FeignClient(name = "demo-32-provider")
@Component
public interface MyFeignClient {
    /**
     * 调用服务提供者的接口controller里的echo()函数
     * @param str 参数
     * @return 服务提供者的controller里的echo()函数结果
     */
    @GetMapping(value = "/hello/{str}")
     String echo(@PathVariable("str") String str);
}
