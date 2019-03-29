package com.ccnu.controller;

import com.ccnu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by 董乐强 on 2019/3/29
 */

@RestController
public class JdbcController {

    @Autowired
    private UserService userService;

    @RequestMapping("/createUser")
    @ResponseBody
    public String createUser(String username,String password){
        userService.createUser(username,password);
        return "success";
    }

}
