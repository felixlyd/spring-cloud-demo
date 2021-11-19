package com.example.demo37auth2.config;

import com.example.demo37auth2.service.UserSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

/**
 * class Auth2Config
 *
 * @author : liuyaodong
 * @date 2021/11/18
 */
@Configuration
@EnableAuthorizationServer
public class Auth2Config extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserSecurityService userSecurityService;

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpointsConfigurer) {
        endpointsConfigurer.authenticationManager(authenticationManager)
                .userDetailsService(userSecurityService);
    }
    @Override
    public void configure(ClientDetailsServiceConfigurer clientConfigurer) throws Exception{
        clientConfigurer.inMemory().withClient("app")
                .secret(passwordEncoder.encode("123456"))
                .authorizedGrantTypes("password")
                .scopes("all")
                .accessTokenValiditySeconds(36000)
                .and()
                .withClient("web")
                .secret(passwordEncoder.encode("123456"))
                .authorizedGrantTypes("password", "refresh_token","authorization_code","client_credentials")
                .scopes("all")
                .redirectUris("https://www.phei.com.cn")
                .accessTokenValiditySeconds(36000);
    }
}
