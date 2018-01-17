package org.xi.userservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.xi.vo.user.UserVo;

@Mapper
public interface UserMapper {

    UserVo getById(@Param("id") Integer id);
}
