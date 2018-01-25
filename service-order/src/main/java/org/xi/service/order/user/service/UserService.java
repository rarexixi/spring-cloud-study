package org.xi.service.order.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.xi.model.Result;
import org.xi.service.order.user.service.hystric.UserServiceHystric;
import org.xi.vo.user.UserVo;

@FeignClient(value = "user-service", fallback = UserServiceHystric.class)
public interface UserService {

    @RequestMapping(value = "/user/getById/{id}", method = RequestMethod.GET)
    Result<UserVo> getById(@PathVariable("id") Integer id, @RequestParam("sessionId") String sessionId);

    @RequestMapping(value = "/user/addUser", method = RequestMethod.POST)
    Result<Integer> addUser(@RequestBody UserVo user, @RequestParam("sessionId") String sessionId);
}
