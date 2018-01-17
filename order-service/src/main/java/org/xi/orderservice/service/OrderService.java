package org.xi.orderservice.service;

import org.xi.vo.order.OrderVo;

public interface OrderService {

    OrderVo getById(Integer id);
}
