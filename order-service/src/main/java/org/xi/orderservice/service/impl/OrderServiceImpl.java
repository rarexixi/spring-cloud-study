package org.xi.orderservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.xi.orderservice.mapper.OrderMapper;
import org.xi.orderservice.service.OrderService;
import org.xi.vo.order.OrderVo;

public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public OrderVo getById(Integer id) {

        OrderVo order = orderMapper.getById(id);
        return order;
    }
}
