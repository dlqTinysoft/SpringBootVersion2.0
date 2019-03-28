package com.ccnu.app;

import com.ccnu.vo.User;
import lombok.extern.slf4j.Slf4j;

/**
 * created by 董乐强 on 2019/3/28
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        User user = new User();
        /*user.setAge(18);
        user.setPassword("dlq");
        user.setUsername("董乐强");*/
        log.info(user.toString());
    }


}
