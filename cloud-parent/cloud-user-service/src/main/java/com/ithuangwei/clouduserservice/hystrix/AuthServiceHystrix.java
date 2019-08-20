package com.ithuangwei.clouduserservice.hystrix;

import com.ithuangwei.clouduserservice.domain.JWT;
import com.ithuangwei.clouduserservice.feign.AuthServiceClient;
import org.springframework.stereotype.Component;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/19 16:54
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient {

    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        return null;
    }
}
