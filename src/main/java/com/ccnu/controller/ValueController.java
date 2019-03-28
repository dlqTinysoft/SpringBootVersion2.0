package com.ccnu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created by 董乐强 on 2019/3/28
 */
@Slf4j
@Controller
public class ValueController {

    @Value("${name}")
    private String username;
    @Value("${httpUrl}")
    private String httpUrl;

    @RequestMapping("/getValue")
    @ResponseBody
    public String getValue(){
        return username+"--"+httpUrl;
    }


}
