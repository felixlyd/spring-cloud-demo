package org.example.felixlyd.demo02.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * class CoExample
 *
 * @author : liuyaodong
 * @date 2021/9/27
 */
@Data
@Component
@ConfigurationProperties(prefix = "com.example")
public class CoExample {
    private String name;
    private int age;
    private List<String > address;
}
