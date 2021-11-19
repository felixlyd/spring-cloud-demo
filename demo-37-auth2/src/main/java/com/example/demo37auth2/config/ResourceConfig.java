package com.example.demo37auth2.config;

import com.example.demo37auth2.config.handler.FailAuthenticationHandler;
import com.example.demo37auth2.config.handler.SuccessAuthenticationHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * class ResourceConfig
 *
 * @author : liuyaodong
 * @date 2021/11/18
 */
@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceConfig extends ResourceServerConfigurerAdapter {
    @Autowired
    private FailAuthenticationHandler failAuthenticationHandler;

    @Autowired
    private SuccessAuthenticationHandler successAuthenticationHandler;

    @Override
    public void configure(HttpSecurity httpSecurity) throws  Exception{
        httpSecurity.antMatcher("/user/**").
                formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .loginPage("/user/login")
                .successHandler(successAuthenticationHandler)
                .failureHandler(failAuthenticationHandler)
                .and()
                .authorizeRequests();
        httpSecurity.authorizeRequests()
                .antMatchers("/user/register").permitAll();
    }
}
