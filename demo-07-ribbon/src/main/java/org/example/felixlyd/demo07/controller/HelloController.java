package org.example.felixlyd.demo07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * class HelloController
 * 访问的是ribbon自己维护的服务提供者清单
 * @author : liuyaodong
 * @date 2021/10/9
 */
@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/hello")
    public String hello(){
        /*没有注册中心，是从application.properties中拉取过来的provider*/
        /*并且调用了服务提供者中的方法*/
        return restTemplate.getForObject("http://provider/" + "hello", String.class);
    }
}
