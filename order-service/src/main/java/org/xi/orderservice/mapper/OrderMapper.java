package org.xi.orderservice.mapper;

import org.apache.ibatis.annotations.Param;
import org.xi.vo.order.OrderVo;

public interface OrderMapper {

    OrderVo getById(@Param("id") Integer id);
}
