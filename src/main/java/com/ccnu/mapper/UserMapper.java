package com.ccnu.mapper;

import com.ccnu.vo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * created by 董乐强 on 2019/3/29
 */
public interface UserMapper {

    @Select("SELECT * FROM test1 WHERE username = #{name}")
    User findByName(@Param("name") String name);
    @Insert("INSERT INTO test1(username, password) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

}
