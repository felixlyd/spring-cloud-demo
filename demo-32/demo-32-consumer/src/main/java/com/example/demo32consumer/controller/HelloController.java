package com.example.demo32consumer.controller;

import com.example.demo32consumer.feign.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * class HelloController
 *
 * @author : liuyaodong
 * @date 2021/11/8
 */
@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private MyFeignClient myFeignClient;

    @GetMapping(value = "/hello-rest/{str}")
    public String rest(@PathVariable String str) {
        return restTemplate.getForObject("http://demo-32-provider/hello/" + str, String.class);
    }
    @GetMapping(value = "/hello-feign/{str}")
    public String feign(@PathVariable String str) {
        return myFeignClient.echo(str);
    }
}
