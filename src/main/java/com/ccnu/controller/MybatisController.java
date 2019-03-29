package com.ccnu.controller;

import com.ccnu.service.UserService;
import com.ccnu.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by 董乐强 on 2019/3/29
 */
@RestController
public class MybatisController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/getUser")
    public User findUser(String username){
        User user = userService.findUserByName(username);
        return user;
    }


}
