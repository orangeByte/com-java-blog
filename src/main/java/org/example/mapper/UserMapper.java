package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.entity.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    User findUser(@Param("username") String username, @Param("password") String password);
}
