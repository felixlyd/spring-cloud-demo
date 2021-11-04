package com.example.demo29sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class TestController
 *
 * @author : liuyaodong
 * @date 2021/11/3
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    @SentinelResource("hello")
    public String hello(){
        return "Hello Sentinel Demo";
    }
}
