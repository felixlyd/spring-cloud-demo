package org.example.felixlyd.demo11copy.hystrix;


import org.example.felixlyd.demo11copy.feign.MyFeignClient2;
import org.springframework.stereotype.Component;

/**
 * class HelloHystrix
 * 添加回调处理类，在服务熔断时返回的内容
 * @author : liuyaodong
 * @date 2021/10/9
 */
@Component
public class HelloHystrix implements MyFeignClient2 {

    @Override
    public String hello() {
        return "出现错误";
    }
}
