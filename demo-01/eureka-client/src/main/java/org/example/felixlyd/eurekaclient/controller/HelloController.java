package org.example.felixlyd.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @classname HelloController 服务接口
 * @author liuyaodong
 * @date 2021/9/26
 */
@RestController
public class HelloController {

    /** 服务提供者名称*/
    @Value("${provider.name}")
    private String name;

    /** 服务提供者端号*/
    @Value("${server.port}")
    private String port;

    /**
     *
     * @return 返回服务提供者信息
     */
    @RequestMapping("/hello")
    public String hello(){
        return "provider:" + name + " port:" + port;
    }

}
