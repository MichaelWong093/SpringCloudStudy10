package com.ithuangwei.cloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/14 10:35
 */
@RestController
@RefreshScope
public class HiController {

    @Value("${foo}")
    String foo;

    @GetMapping("/foo")
    public String hi() {
        return foo;
    }
}
