package org.example.felixlyd.demo08.controller;

import org.example.felixlyd.demo08.fegin.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class HelloController
 * 调用MyFeignClient对外提供功能
 * @author : liuyaodong
 * @date 2021/10/9
 */
@RestController
public class HelloController {
    @Autowired
    MyFeignClient myFeignClient;
    @GetMapping("/hello")
    public String index(){
        return myFeignClient.hello();
    }
}
