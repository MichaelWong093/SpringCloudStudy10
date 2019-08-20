package com.ithuangwei.clouduserservice.service;

import com.ithuangwei.clouduserservice.domain.JWT;
import com.ithuangwei.clouduserservice.domain.User;
import com.ithuangwei.clouduserservice.domain.UserLoginDTO;
import com.ithuangwei.clouduserservice.exception.UserLoginException;
import com.ithuangwei.clouduserservice.feign.AuthServiceClient;
import com.ithuangwei.clouduserservice.repository.UserDao;
import com.ithuangwei.clouduserservice.utils.BPwdEncodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Huangw
 * @projectName workspace_study
 * @description: TODO
 * @date 2019/8/19 15:30
 */
@Service
public class UserServiceDetail {

    @Autowired
    private UserDao userDao;

    @Autowired
    private AuthServiceClient client;

    public UserLoginDTO login(String username, String password) {
        User user = userDao.findByUsername(username);
        if (user == null) {
            throw new UserLoginException("error username");
        }
        if (!BPwdEncodeUtil.matches(password,user.getPassword())) {
            throw new UserLoginException("error password");
        }
        JWT jwt = client.getToken("Basic dXNlci1zZXJ2aWNlOjEyMzQ1Ng==", "password", username, password);
        if (jwt == null) {
            throw new UserLoginException("error internal");
        }
        UserLoginDTO userLoginDTO = new UserLoginDTO();
        userLoginDTO.setJwt(jwt);
        userLoginDTO.setUser(user);
        return userLoginDTO;
    }

    public User insertUser(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(BPwdEncodeUtil.BCryptPassword(password));
        return userDao.save(user);
    }
}
