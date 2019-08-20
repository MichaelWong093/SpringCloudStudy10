package com.ithuangwei.cloudauthservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/16 15:37
 */
@AllArgsConstructor
@Getter
@Setter
public class Blog {

    private Long id;
    private String name;
    private String content;


}
