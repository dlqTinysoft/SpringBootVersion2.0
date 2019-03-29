package com.ccnu.controller;

import com.ccnu.entity.School;
import com.ccnu.service.SchoolService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by 董乐强 on 2019/3/29
 */
@RestController
public class PageHelperController {

    @Autowired
    private SchoolService schoolService;


    @ResponseBody
    @RequestMapping("/getSchool")
    public  List<School> getSchool(int page, int size){
        PageInfo<School> pageInfo =schoolService.findSchoolList(page,size);;
        List<School> schools =  pageInfo.getList();
        return schools;
    }

}
