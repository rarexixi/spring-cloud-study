package org.xi.service.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xi.service.user.mapper.UserMapper;
import org.xi.service.user.service.UserService;
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
