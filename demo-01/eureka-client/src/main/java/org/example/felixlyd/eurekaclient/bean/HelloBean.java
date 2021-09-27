package org.example.felixlyd.eurekaclient.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * class HelloBean
 *
 * @author : liuyaodong
 * @date 2021/9/27
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
