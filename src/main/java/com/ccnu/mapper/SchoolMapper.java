package com.ccnu.mapper;

import com.ccnu.entity.School;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * created by 董乐强 on 2019/3/29
 */
public interface SchoolMapper {

    @Select("SELECT * FROM School ")
    List<School> findSchoolList();
}
