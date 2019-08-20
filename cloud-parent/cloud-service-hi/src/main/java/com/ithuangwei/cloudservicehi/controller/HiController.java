package com.ithuangwei.cloudservicehi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/19 12:17
 */
@RestController
@Slf4j
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String home() {
        return "hi: i am from port:" + port;
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/hello")
    public String hello() {
        return "hello you!";
    }

    @GetMapping("/getPrinciple")
    public OAuth2Authentication getPrinciple(OAuth2Authentication oAuth2Authentication, Principal principal, Authentication authentication) {
        log.info(oAuth2Authentication.getUserAuthentication().getAuthorities().toString());
        log.info("principal.toString()"+principal.toString());
        log.info("pricipal.getName()"+principal.getName());
        log.info("authentication:"+authentication.getAuthorities().toString());
        return oAuth2Authentication;
    }
}
