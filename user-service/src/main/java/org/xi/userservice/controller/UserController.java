package org.xi.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.xi.model.Result;
import org.xi.userservice.service.UserService;
import org.xi.vo.user.UserVo;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public Result<UserVo> getById(@PathVariable("id") Integer id, String sessionId) {

        UserVo user = userService.getById(id);
        if(user == null) {
            return new Result<>(-1,"用户不存在");
        }
        return new Result<>(user);
    }
}