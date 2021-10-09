package org.example.felixlyd.consulprovider.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * class HelloBean
 * 服务提供者
 * @author : liuyaodong
 * @date 2021/9/30
 */
@Data
@Component
@ConfigurationProperties(prefix = "provider")
public class HelloBean {
    /** 服务提供者名称*/
    private String name;
    /** 服务提供者端号*/
    private String port;
}
