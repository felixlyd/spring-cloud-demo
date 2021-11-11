package com.example.demo32consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class SampleController
 *
 * @author : liuyaodong
 * @date 2021/11/9
 */
@RestController
@RefreshScope
public class TestConfigController {
    @Value("${mysql.address}")
    String address;
    @Value("${mysql.port}")
    String port;
    @RequestMapping("/getProperties")
    public String get(){
        return address + "\t" + port;
    }
}
