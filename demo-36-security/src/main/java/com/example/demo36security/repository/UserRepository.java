package com.example.demo36security.repository;

import com.example.demo36security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * class UserRepository
 *
 * @author : liuyaodong
 * @date 2021/11/12
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * 通过用户名称查一条数据
     * @param username 用户名称
     * @return 数据
     */
    User findByUsername(String username);
}
