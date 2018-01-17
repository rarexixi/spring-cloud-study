package org.xi.userservice.service.impl;

import org.springframework.stereotype.Service;
import org.xi.uservo.UserVo;
import org.xi.userservice.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public UserVo getById(Integer id) {

        UserVo user = new UserVo();
        user.setId(1);
        user.setUsername("rarexixi");
        user.setPassword("12345678");
        user.setEmail("rarexixi@gmail.com");
        return user;
    }
}
