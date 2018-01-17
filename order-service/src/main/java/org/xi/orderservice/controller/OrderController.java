package org.xi.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xi.orderservice.service.OrderService;
import org.xi.vo.order.OrderVo;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/getById/{id}")
    public OrderVo getById(@PathVariable("id") Integer id, String sessionId) {

        OrderVo order = orderService.getById(id);
        return order;
    }
}
