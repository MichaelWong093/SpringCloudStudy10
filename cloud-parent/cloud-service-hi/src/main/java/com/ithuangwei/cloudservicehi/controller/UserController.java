package com.ithuangwei.cloudservicehi.controller;

import com.ithuangwei.cloudservicehi.domain.User;
import com.ithuangwei.cloudservicehi.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/16 11:32
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/registry",method = RequestMethod.POST)
    public User createUser(@RequestParam("username") String username,
                           @RequestParam("password") String password) {
        return userService.create(new User(username, password));

    }
}
