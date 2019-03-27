package com.ccnu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * created by 董乐强 on 2019/3/27
 */
@Controller
public class JSPController {


    @RequestMapping("/jspIndex")
    public String index(Map<String,Object> map){
        map.put("name","董乐强");
        map.put("age",26);
        return "jspindex";
    }
}
