package org.xi.service.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xi.service.order.mapper.OrderMapper;
import org.xi.service.order.service.OrderService;
import org.xi.vo.order.OrderVo;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Override
    public OrderVo getById(Integer id) {

        OrderVo order = orderMapper.getById(id);
        return order;
    }
}
