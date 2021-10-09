package org.example.felixlyd.consulconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2021/9/30
 */
@RestController
public class HelloController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    /** 调用服务的接口*/
    @GetMapping("/hello")
    public String hello(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("service-provider");
        URI uri = serviceInstance.getUri();
        String callService = new RestTemplate().getForObject(uri+"/hello", String.class);
        System.out.println(callService);
        return callService;
    }
}
