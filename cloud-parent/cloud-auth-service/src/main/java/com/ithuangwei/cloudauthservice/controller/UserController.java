package com.ithuangwei.cloudauthservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/19 10:28
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @RequestMapping(value="/current",method = RequestMethod.GET)
    public Principal getUser(Principal principal) {
        return principal;
    }
}
