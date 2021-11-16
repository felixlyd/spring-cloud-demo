package com.example.demo36security.config;

import com.example.demo36security.config.handler.FailAuthenticationHandler;
import com.example.demo36security.config.handler.SuccessAuthenticationHandler;
import com.example.demo36security.service.UserSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * class SecurityConfig
 *
 * @author : liuyaodong
 * @date 2021/11/12
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private FailAuthenticationHandler failAuthenticationHandler;
    @Autowired
    private SuccessAuthenticationHandler successAuthenticationHandler;

    @Autowired
    private UserSecurityService userSecurityService;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(){};
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.antMatcher("/user/**")
                .formLogin()
                .usernameParameter("username")
                .passwordParameter("password")
                .loginPage("/user/login")
                .successHandler(successAuthenticationHandler)
                .failureHandler(failAuthenticationHandler)
                .and()
                .authorizeRequests()
                .antMatchers("/user/login").permitAll()
                .antMatchers("/user/register").permitAll();
        httpSecurity.logout().permitAll();
        httpSecurity.cors().and().csrf().ignoringAntMatchers("/user/**");
        httpSecurity.logout().logoutUrl("/user/logout").permitAll();
    }


    @Override
    protected  void  configure(AuthenticationManagerBuilder auth) throws  Exception{
        auth.userDetailsService(userSecurityService).passwordEncoder(passwordEncoder());
    }
}
