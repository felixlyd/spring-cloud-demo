package org.example.felixlyd.demo18gatewayfault.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * class NotFoundController
 * 路由容错控制器
 * @author : liuyaodong
 * @date 2021/10/12
 */
@RestController
public class NotFoundController {
    @RequestMapping(value = "/notfound")
    public Mono<Map<String, String>> notFound(){
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("code","404");
        stringMap.put("msg", "Not Found");
        return Mono.just(stringMap);
    }
}
