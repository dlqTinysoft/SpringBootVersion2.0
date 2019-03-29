package com.ccnu.service;

import com.ccnu.mapper.UserMapper;
import com.ccnu.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by 董乐强 on 2019/3/29
 * SpringBoot集成jdbc
 * SpringBoot集成mybatis
 */
@Service
public class UserServiceImpl implements UserService {

   /* @Autowired
    private JdbcTemplate jdbcTemplate;*/

    @Autowired
    private UserMapper userMapper;

    @Override
    public void createUser(String username, String password) {
           //sql语句预处理，？表示占位符
          //jdbcTemplate.update("insert  into test1 values(?,?);",username,password);
    }

    @Override
    public User findUserByName(String name){
        User user = userMapper.findByName(name);
        return user;
    }

}
