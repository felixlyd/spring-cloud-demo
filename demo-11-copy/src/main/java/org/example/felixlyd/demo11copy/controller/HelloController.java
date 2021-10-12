package org.example.felixlyd.demo11copy.controller;


import org.example.felixlyd.demo11copy.feign.MyFeignClient2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2021/10/9
 */
@RestController
public class HelloController {

    @Autowired
    private MyFeignClient2 myFeignClient;

    @GetMapping("/hello")
    public String index(){
        return myFeignClient.hello();
    }
}
