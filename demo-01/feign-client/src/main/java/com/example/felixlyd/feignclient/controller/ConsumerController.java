package com.example.felixlyd.feignclient.controller;

import com.example.felixlyd.feignclient.feign.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class ConsumerController
 *
 * @author : liuyaodong
 * @date 2021/9/27
 */
@RestController
public class ConsumerController {

    @Autowired
    MyFeignClient myFeignClient;

    /**
     *
     * @return 返回内容
     */
    @RequestMapping("/")
    public String index(){
        return myFeignClient.hello();
    }
}
