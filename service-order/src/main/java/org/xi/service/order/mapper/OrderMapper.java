package org.xi.service.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.xi.vo.order.OrderVo;

@Mapper
public interface OrderMapper {

    OrderVo getById(@Param("id") Integer id);
}
