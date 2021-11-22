package com.example.demo38auth2mysql.controller;

import com.example.demo38auth2mysql.entity.User;
import com.example.demo38auth2mysql.service.UserService;
import com.example.demo38auth2mysql.util.AbstractResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * class UserController
 *
 * @author : liuyaodong
 * @date 2021/11/18
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> userList(){
        return userService.findAllUsers();
    }

    @PreAuthorize("hasAuthority('ROLE_admin')")
    @GetMapping("/test-role-authority")
    public String testRoleAuthority(){
        return "ROLE权限查看";
    }

    @PreAuthorize("hasAuthority('admin')")
    @GetMapping("/test-admin-authority")
    public String testAdminAuthority(){
        return "admin权限查看";
    }

    @GetMapping("/register")
    public ResponseEntity<AbstractResponseUtil> register(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        userService.saveUser(user);
        return ResponseEntity.ok(new AbstractResponseUtil(user));
    }

}
