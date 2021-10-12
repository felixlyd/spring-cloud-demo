package org.example.felixlyd.demo03;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * class GetPersonInfoProperties
 *
 * @author : liuyaodong
 * @date 2021/9/27
 */
@Data
@Component
@ConfigurationProperties(prefix = "personinfo")
public class GetPersonInfoProperties {
    private String name;
    private int age;
}
