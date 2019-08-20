package com.ithuangwei.cloudservicehi.service.impl;

import com.ithuangwei.cloudservicehi.domain.User;
import com.ithuangwei.cloudservicehi.repository.UserDao;
import com.ithuangwei.cloudservicehi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/19 12:09
 */
@Service
public class UserServiceImpl implements UserService {

    private static final BCryptPasswordEncoder ENCODER = new BCryptPasswordEncoder();

    @Autowired
    private UserDao userDao;

    @Override
    public User create(User user) {
        String hash = ENCODER.encode(user.getPassword());
        user.setPassword(hash);
        User u = userDao.save(user);
        return u;
    }
}
