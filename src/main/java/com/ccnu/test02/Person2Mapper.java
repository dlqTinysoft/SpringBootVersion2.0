package com.ccnu.test02;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * created by 董乐强 on 2019/3/29
 */
public interface Person2Mapper {

    @Insert("INSERT INTO person (username, password) VALUES(#{username}, #{password})")
    int insert(@Param("username") String username, @Param("password") String password);
}
