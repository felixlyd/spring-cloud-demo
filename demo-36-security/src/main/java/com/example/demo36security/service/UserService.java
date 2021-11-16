package com.example.demo36security.service;

import com.example.demo36security.entity.User;
import org.springframework.stereotype.Service;

/**
 * class UserService
 *
 * @author : liuyaodong
 * @date 2021/11/16
 */
@Service
public interface UserService {
    /**
     * 保存User
     * @param user 用户
     */
    void saveUser(User user);
}
