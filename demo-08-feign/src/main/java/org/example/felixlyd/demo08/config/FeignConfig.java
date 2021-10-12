package org.example.felixlyd.demo08.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * class FeignConfig
 *
 * @author : liuyaodong
 * @date 2021/10/9
 */
@Configuration
public class FeignConfig {

    /**
     * Spring Cloud Netflix默认的SpringMVCController将被替换为feign.Contract.Default
     * 用feign.Contract.Default将契约改成Feign原生的契约，然后使用Feign自带的注解@RequestLine("GET /hello")
     */
    @Bean
    public Contract feignContract(){
        return new feign.Contract.Default();
    }

    /**
     * 配置记录日志的等级
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
