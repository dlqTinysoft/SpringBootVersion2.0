package com.ccnu.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * created by 董乐强 on 2019/3/28
 */
@Slf4j
@Service
public class AysncService {

    /**
     * 加上注解@Async后，该方法就是异步执行啦，其实就是开个线程来执行该任务。
     * 这种是线程执行，无返回值的情况。
     */
    @Async
    public void hello(){
        log.info("========进入service=====");

        try {
            log.info("======开始处理数据============");
            Thread.sleep(5000);
            log.info("========5秒后数据处理完成======");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("=======service结束==========");
    }

    /**
     * 需要返回数据的情况
     * @return
     */
    @Async
    public Future<String> hello1(){
        log.info("========进入service====="+Thread.currentThread().getName());
        Future<String> future = null;
        try {
            log.info("======开始处理数据============");
            Thread.sleep(5000);
            log.info("========5秒后数据处理完成======");
            future = new AsyncResult<String>("success");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("=======service结束==========");
        return future;
    }
}
