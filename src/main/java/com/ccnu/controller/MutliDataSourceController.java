package com.ccnu.controller;

import com.ccnu.service.MutliDataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by 董乐强 on 2019/3/29
 */

@RestController
public class MutliDataSourceController {


    @Autowired
    private MutliDataSourceService mutliDataSourceService;

    /**
     * 多数据源创建用户
     * @param username
     * @param password
     * @return
     */
    @ResponseBody
    @RequestMapping("/createPerson")
    public int createPerson(String username,String password){
        return mutliDataSourceService.createPerson(username,password);
    }


}
