package org.xi.userservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xi.userservice.mapper.UserMapper;
import org.xi.userservice.service.UserService;
import org.xi.vo.user.UserVo;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UserVo getById(Integer id) {

        UserVo user = userMapper.getById(id);
        return user;
    }
}
