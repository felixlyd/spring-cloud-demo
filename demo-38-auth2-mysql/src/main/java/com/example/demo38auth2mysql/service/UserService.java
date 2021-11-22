package com.example.demo38auth2mysql.service;


import com.example.demo38auth2mysql.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 查看所有用户
     * @return 用户列表
     */
    List<User> findAllUsers();
}
