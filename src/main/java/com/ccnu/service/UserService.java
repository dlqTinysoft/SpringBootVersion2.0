package com.ccnu.service;

import com.ccnu.vo.User;

/**
 * created by 董乐强 on 2019/3/29
 */
public interface UserService {

    void createUser(String username,String password);
    User findUserByName(String name);
}
