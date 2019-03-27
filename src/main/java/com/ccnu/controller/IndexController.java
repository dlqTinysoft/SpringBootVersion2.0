package com.ccnu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * created by 董乐强 on 2019/3/27
 */

@RestController
public class IndexController {

    /**
     * 为了开发规范，凡是作为一个服务来调用的（即非页面跳转），使用@RestController，
     * 如果是作为页面跳转、封装页面数据的，使用@Controller
     * @return
     */
    @RequestMapping("/index")
    public String index(){

        return "第一个SpringbootDemo学习";
    }

    /**
     * 返回json字符串模式，SpringBoot会直接将对象转换为json串
     * @return
     */
    @RequestMapping("/getOrder")
    public Map<String, Object> getOrder(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("orderId", UUID.randomUUID().toString());
        map.put("orderName","爱奇艺支付");
        return map;
    }
    @RequestMapping("/exceptionDemo")
    public String exceptionIndex(Integer i) throws Exception {
        throw new Exception("报错了");
    }

}
