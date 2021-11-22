package com.example.demo38auth2mysql.repository;

import com.example.demo38auth2mysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * class UserRepository
 *
 * @author : liuyaodong
 * @date 2021/11/18
 */
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * 通过用户名称查一条数据
     * @param username 用户名称
     * @return 数据
     */
    User findByUsername(String username);
}
