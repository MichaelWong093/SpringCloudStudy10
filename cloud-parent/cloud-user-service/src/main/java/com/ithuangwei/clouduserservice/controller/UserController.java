package com.ithuangwei.clouduserservice.controller;

import com.ithuangwei.clouduserservice.domain.User;
import com.ithuangwei.clouduserservice.domain.UserLoginDTO;
import com.ithuangwei.clouduserservice.service.UserServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/19 15:38
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceDetail userServiceDetail;

    @PostMapping("/login")
    public UserLoginDTO login(@RequestParam("username") String username, @RequestParam("password") String password) {
        return userServiceDetail.login(username, password);
    }

    @GetMapping("/foo")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String getFoo() {
        return "i'm foo, " + UUID.randomUUID().toString();
    }


    @PostMapping("/register")
    public User postUser(@RequestParam("username")String username, @RequestParam("password")String password) {
        return userServiceDetail.insertUser(username, password);
    }
}
