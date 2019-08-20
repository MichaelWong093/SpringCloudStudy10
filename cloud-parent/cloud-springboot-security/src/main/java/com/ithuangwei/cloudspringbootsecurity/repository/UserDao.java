package com.ithuangwei.cloudspringbootsecurity.repository;

import com.ithuangwei.cloudspringbootsecurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/19 8:47
 */
public interface UserDao extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
