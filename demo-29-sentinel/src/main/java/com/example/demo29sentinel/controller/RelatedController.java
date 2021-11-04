package com.example.demo29sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class RelatedController
 *
 * @author : liuyaodong
 * @date 2021/11/3
 */
@RestController
@RequestMapping("/related")
public class RelatedController {
    @GetMapping("a")
    public String flowRelatedA(){
        System.out.println("a 接口");
        return "a 接口";
    }
    @GetMapping("b")
    public String flowRelatedB(){
        System.out.println("b 接口");
        return "b 接口";
    }
}
