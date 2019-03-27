package com.ccnu.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * created by 董乐强 on 2019/3/27
 */
@ControllerAdvice
public class ExceptionController {


    //BasicErrorController
    //ErrorMvcAutoConfiguration
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map<String,Object> exceptionHandler(Exception ex){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("errorCode",405);
        map.put("errorMessage",ex.getMessage());
        return map;
    }
}
