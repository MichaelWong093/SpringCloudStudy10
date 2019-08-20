package com.ithuangwei.cloudservicehi.repository;

import com.ithuangwei.cloudservicehi.domain.User;
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
