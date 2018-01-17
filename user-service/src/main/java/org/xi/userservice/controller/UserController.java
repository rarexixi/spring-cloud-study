package org.xi.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xi.uservo.UserVo;
import org.xi.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getById/")
    public UserVo getById(Integer id, String sessionId) {

        UserVo user = userService.getById(id);
        return user;
    }
}