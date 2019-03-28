package com.ccnu.controller;

import com.ccnu.service.AysncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * created by 董乐强 on 2019/3/28
 */
@Slf4j
@Controller
public class AysncController {

    @Autowired
    private AysncService aysncService;


    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        log.info("====进入controller=====");
        aysncService.hello();
        log.info("====Controller执行结束=====");
        return "sucess";
    }


    @ResponseBody
    @RequestMapping("/hello1")
    public String hello1(){
        log.info("====进入controller=====");
        Future<String> future = aysncService.hello1();
        log.info("====Controller执行结束=====");
        String info = null;
        try {
            //拿数据的时候会阻塞等待，等待获取数据。
            info = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return info;
    }




}
