package com.example.demo38auth2mysql.service.impl;

import com.example.demo38auth2mysql.entity.User;
import com.example.demo38auth2mysql.repository.UserRepository;
import com.example.demo38auth2mysql.service.UserSecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 自定义认证管理器
 * class UserSecurityService
 * @author : liuyaodong
 * @date 2021/11/12
 */
@Service
public class UserSecurityServiceImpl implements UserSecurityService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(name);
        if(user==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
    }
}
