package com.example.demo36security.service.impl;

import com.example.demo36security.entity.User;
import com.example.demo36security.repository.UserRepository;
import com.example.demo36security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * class classname
 *
 * @author : liuyaodong
 * @date 2021/11/16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository ;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

}
