package org.example.felixlyd.demo06.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * class TestController
 * Ribbon的规则测试类
 * @author : liuyaodong
 * @date 2021/10/9
 */
@RestController
public class TestController {
    /** 注入LoadBalancerClient*/
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");

    @GetMapping("/test")
    public void test(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("provider");
        System.out.println(serviceInstance.getHost() + serviceInstance.getPort()+" "+ sdf.format(date));
    }
}
