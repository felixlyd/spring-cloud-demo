package com.example.demo32provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * class HelloController
 *
 * @author : liuyaodong
 * @date 2021/11/8
 */
@RestController
public class HelloController {
    @GetMapping("/hello/{string}")
    public String echo(@PathVariable("string") String string){
        return string;
    }
}
