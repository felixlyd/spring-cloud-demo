package com.example.demo38auth2mysql.config;

import com.example.demo38auth2mysql.service.UserSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import javax.sql.DataSource;
import java.util.concurrent.TimeUnit;

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
    private AuthenticationManager authenticationManager;

    @Autowired
    /*在配置文件中定义mysql数据库信息*/
    private DataSource dataSource;

    @Autowired
    private RedisConnectionFactory connectionFactory;

    @Autowired
    private UserSecurityService userSecurityService;

    @Bean
    public TokenStore tokenStore() {
        /*声明TokenStore用mysql存储*//*
        return new JdbcTokenStore(dataSource);*/

        return new RedisTokenStore(connectionFactory);
    }

    @Bean
    public ClientDetailsService clientDetails() {
        /*声明ClientDetails实现，使用JdbcClientDetailsService客户端详情服务*/
        return new JdbcClientDetailsService(dataSource);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
        /*使用oauth2的密码模式时需要配置authenticationManager*/
        endpoints.authenticationManager(authenticationManager);
        endpoints.tokenStore(tokenStore())
                /* 配置tokenStore,需要配置userDetailsService，否则refresh_token会报错*/
                .userDetailsService(userSecurityService);

        // 配置TokenServices参数
        DefaultTokenServices tokenServices = new DefaultTokenServices();
        //从数据库查询Token
        tokenServices.setTokenStore(endpoints.getTokenStore());
        tokenServices.setSupportRefreshToken(false);
        tokenServices.setClientDetailsService(endpoints.getClientDetailsService());
        tokenServices.setTokenEnhancer(endpoints.getTokenEnhancer());
        tokenServices.setAccessTokenValiditySeconds((int) TimeUnit.DAYS.toSeconds(30));
        endpoints.tokenServices(tokenServices);

    }


    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) {
        // 开启oauth、token_key验证端口无权限访问
        oauthServer.checkTokenAccess("permitAll()");
        oauthServer.allowFormAuthenticationForClients();
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //从JDBC查出数据，如客户端ID、密码、授权方式等
        clients.withClientDetails(clientDetails());
        /*clients.inMemory()
                .withClient("client")
                .secret("secret")
                .authorizedGrantTypes("authorization_code")
                .scopes("app")*/
    }
}
