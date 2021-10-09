package org.example.felixlyd.consulprovider.controller;

import org.example.felixlyd.consulprovider.bean.HelloBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class HelloController
 * <p>服务接口</p>
 * @author : liuyaodong
 * @date 2021/9/30
 */
@RestController
public class HelloController {

    /** 注入服务提供者信息*/
    @Autowired
    private HelloBean helloBean;

    @RequestMapping("/hello")
    public String hello(){
        return "provider:" + helloBean.getName() + " port:" + helloBean.getPort();
    }
}
