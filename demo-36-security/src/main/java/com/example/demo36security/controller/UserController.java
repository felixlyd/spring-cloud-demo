package com.example.demo36security.controller;

import com.example.demo36security.entity.User;
import com.example.demo36security.repository.UserRepository;
import com.example.demo36security.util.AbstractResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * class UserController
 *
 * @author : liuyaodong
 * @date 2021/11/12
 */
@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 返回所有用户
     */
    @Autowired
    private UserRepository userRepository;
    @GetMapping()
    public List<User> get(){
        return userRepository.findAll();
    }
    /**
     * 注册用户
     */
    @GetMapping("/register")
    public ResponseEntity<AbstractResponseUtil> register(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode((user.getPassword())));
        AbstractResponseUtil responseData = new AbstractResponseUtil(userRepository.save(user));
        return ResponseEntity.ok(responseData);
    }

}
