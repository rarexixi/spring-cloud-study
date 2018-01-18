package org.xi.orderservice.user.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.xi.model.Result;
import org.xi.orderservice.user.service.hystric.UserServiceHystric;
import org.xi.vo.user.UserVo;

@FeignClient(value = "user-service", fallback = UserServiceHystric.class)
public interface UserService {

    @RequestMapping(value = "/user/getById/{id}", method = RequestMethod.GET)
    Result<UserVo> getById(@PathVariable("id") Integer id, @RequestParam("sessionId") String sessionId);
}
