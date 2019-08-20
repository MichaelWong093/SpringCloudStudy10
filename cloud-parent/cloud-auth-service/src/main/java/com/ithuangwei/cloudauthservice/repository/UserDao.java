package com.ithuangwei.cloudauthservice.repository;

import com.ithuangwei.cloudauthservice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/19 10:08
 */
public interface UserDao extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
