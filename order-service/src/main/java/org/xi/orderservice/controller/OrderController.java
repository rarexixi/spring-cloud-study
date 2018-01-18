package org.xi.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xi.model.Result;
import org.xi.orderservice.service.OrderService;
import org.xi.orderservice.user.service.UserService;
import org.xi.vo.order.OrderVo;
import org.xi.vo.user.UserVo;

@RequestMapping("/order")
@RestController
@RefreshScope
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    UserService userService;

    @Value("${order.sessionId}")
    String sessionId;

    @RequestMapping(value = "/hi")
    public String hi() {
        return sessionId;
    }

    @RequestMapping("/getById/{id}")
    public Result<OrderVo> getById(@PathVariable("id") Integer id, String sessionId) {

        OrderVo order = orderService.getById(id);
        if (order == null) {
            return new Result<>(-1, "订单不存在");
        }
        Result<UserVo> userResult = userService.getById(id, "order-session");
        UserVo user;
        if (!userResult.isSuccess() || (user = userResult.getResult()) == null) {
            return new Result<>(-2, "订单用户不存在");
        }
        order.setUsername(user.getUsername());
        return new Result<>(order);
    }
}
