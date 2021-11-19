package com.example.demo37auth2.service.impl;

import com.example.demo37auth2.entity.User;
import com.example.demo37auth2.repository.UserRepository;
import com.example.demo37auth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        User user1 = userRepository.findByUsername(user.getUsername());
        if(user1==null){
            userRepository.save(user);
        }else {
            throw new RuntimeException("用户已存在");
        }
    }


    @Override
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

}
