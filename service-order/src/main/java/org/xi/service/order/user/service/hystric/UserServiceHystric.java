package org.xi.service.order.user.service.hystric;

import org.springframework.stereotype.Service;
import org.xi.model.Result;
import org.xi.service.order.user.service.UserService;
import org.xi.vo.user.UserVo;

@Service
public class UserServiceHystric implements UserService {

    @Override
    public Result<UserVo> getById(Integer id, String sessionId) {
        return new Result<>(-3, "用户无法发现");
    }

    @Override
    public Result<Integer> addUser(UserVo user, String sessionId) {
        return null;
    }
}
