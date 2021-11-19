package org.example.felixlyd.demo18gatewayhystrix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2021/10/12
 */
@RestController
public class NotFoundController {
    @RequestMapping(value = "/fallback")
    public Mono<Map<String, String>> notFound() {
        Map<String, String> stringMap = new HashMap<>(2);
        stringMap.put("code", "100");
        stringMap.put("data", "Service Not Available");
        return Mono.just(stringMap);
    }
}
