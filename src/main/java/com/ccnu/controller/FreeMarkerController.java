package com.ccnu.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Map;

/**
 * created by 董乐强 on 2019/3/27
 */
@Controller
public class FreeMarkerController {

    private Logger logger = LoggerFactory.getLogger(FreeMarkerController.class);

    @RequestMapping("/ftindex")
    public String index(Map<String,Object> map){
         map.put("name","董乐强");
         map.put("age","26");
         logger.info("==============name:董乐强,age:25===============");
         //直接会跳转到templates目录下的index.ftl,会将map封装的数据绑定到index.ftl
        return "index";
    }

}
