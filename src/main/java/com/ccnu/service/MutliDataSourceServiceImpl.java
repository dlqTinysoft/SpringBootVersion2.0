package com.ccnu.service;

import com.ccnu.test01.Person1Mapper;
import com.ccnu.test02.Person2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by 董乐强 on 2019/3/29
 */

@Service
public class MutliDataSourceServiceImpl implements MutliDataSourceService{


    @Autowired
    private Person1Mapper person1Mapper;
    @Autowired
    private Person2Mapper person2Mapper;


    //只能添加一个数据源的事务，如果都需要事务，那么就是分布式事务管理了需要采用jta-atomikos
    //@Transactional(transactionManager = "test2TransactionManager")
    //@Transactional()
    @Override
    public Integer createPerson(String username,String password){
        //传统的分布式就是jta+atomikos 注册同一个全局事务
        int i = person1Mapper.insert(username,password);
        int j = person2Mapper.insert(username,password);
        return i+j;
    }




}
