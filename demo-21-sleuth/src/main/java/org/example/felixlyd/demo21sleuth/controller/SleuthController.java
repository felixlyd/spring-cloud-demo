package org.example.felixlyd.demo21sleuth.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * class SleuthApplication
 *
 * @author : liuyaodong
 * @date 2021/10/27
 */
@RestController
public class SleuthController {
    private static Logger logger = LoggerFactory.getLogger(SleuthController.class);
    @GetMapping("/hello")
    public String home(){
        logger.info("处理hello页面");
        return "Hello World";
    }
}
