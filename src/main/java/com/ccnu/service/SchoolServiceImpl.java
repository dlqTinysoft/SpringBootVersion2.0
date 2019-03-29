package com.ccnu.service;

import com.ccnu.entity.School;
import com.ccnu.mapper.SchoolMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by 董乐强 on 2019/3/29
 * SpringBoot集成分页插件
 */

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    @Override
    public PageInfo<School> findSchoolList(int page, int size) {
        PageHelper.startPage(page, size);
        List<School> listUser = schoolMapper.findSchoolList();
        // 封装分页之后的数据
        PageInfo<School> pageInfoUser = new PageInfo<School>(listUser);
        return pageInfoUser;
    }
}
