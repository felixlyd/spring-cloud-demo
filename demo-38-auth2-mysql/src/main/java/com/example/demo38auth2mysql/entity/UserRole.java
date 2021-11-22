package com.example.demo38auth2mysql.entity;

import lombok.Getter;
import lombok.Setter;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * class UserRole
 *
 * @author : liuyaodong
 * @date 2021/11/18
 */
@Entity
@Getter
@Setter
public class UserRole {
    @Id
    @Column(nullable = false)
    @GeneratedValue
    private Long id;

    private String role;
    private String name;

}
