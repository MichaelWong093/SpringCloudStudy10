package com.ithuangwei.clouduserservice.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/19 16:55
 */
@Getter
@Setter
public class JWT {

    private String access_token;
    private String token_type;
    private String refresh_token;
    private int expires_in;
    private String scope;
    private String jti;
}
