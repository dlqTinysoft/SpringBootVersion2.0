package com.ccnu.service;

import com.ccnu.entity.School;
import com.github.pagehelper.PageInfo;

/**
 * created by 董乐强 on 2019/3/29
 */
public interface SchoolService {

     PageInfo<School> findSchoolList(int page, int size);
}
