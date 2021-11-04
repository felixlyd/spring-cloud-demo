package com.example.demo29sentinel.controller;

import com.example.demo29sentinel.service.ChainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class ChainController
 *
 * @author : liuyaodong
 * @date 2021/11/3
 */
@RestController
@RequestMapping("/chain")
public class ChainController {

    @Autowired
    private ChainService chainService;

    @GetMapping("a")
    public String flowRelatedA(){
        chainService.chainTest();
        System.out.println("a 接口");
        return "a 接口";
    }
    @GetMapping("b")
    public String flowRelatedB(){
        chainService.chainTest();
        System.out.println("b 接口");
        return "b 接口";
    }

}
