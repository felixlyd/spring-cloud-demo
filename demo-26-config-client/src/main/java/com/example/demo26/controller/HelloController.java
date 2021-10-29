package com.example.demo26.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class HelloController
 *
 * @author : liuyaodong
 * @date 2021/10/29
 */
@RestController
public class HelloController {

    @Value("${app.version}")
    private String version;

    @Value("${message}")
    private String message;

    @Value("${spring.rabbit.host}")
    private String host;

    @Value("${spring.rabbit.port}")
    private String port;

    @GetMapping("/hello")
    public String form(){
        return "version: "+this.version+";port: "+this.port+"\n"+message;
    }
}
