package com.ithuangwei.clouduserservice.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/19 16:57
 */
@Getter
@Setter
public class UserLoginDTO {

    private JWT jwt;

    private User user;
}
