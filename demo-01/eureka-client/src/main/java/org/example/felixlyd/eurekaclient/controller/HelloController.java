package org.example.felixlyd.eurekaclient.controller;

import org.example.felixlyd.eurekaclient.bean.HelloBean;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private HelloBean helloBean;

    /**
     *
     * @return 返回服务提供者信息
     */
    @RequestMapping("/hello")
    public String hello(){
        return "provider:" + helloBean.getName() + " port:" + helloBean.getPort();
    }

}
