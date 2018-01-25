package org.xi.service.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.xi.model.Result;
import org.xi.service.user.service.UserService;
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

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public Result<Integer> addUser(@RequestBody UserVo user, String sessionId) {
        return new Result<>(1);
    }
}