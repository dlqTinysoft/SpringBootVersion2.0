package com.ccnu.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * created by 董乐强 on 2019/3/28
 *
 * 配置类，从传统的xml格式，转换为注解方式配置
 *
 * 自定义线程池

 */

@Configuration
public class MyExecutorConfig {


    /**
     * 定义异步线程池
     * @return
     */
    @Bean
    public AsyncTaskExecutor taskExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setThreadNamePrefix("Anno-Executor");
        executor.setMaxPoolSize(100);

        /**
         * 设置拒绝策略
         */
        executor.setRejectedExecutionHandler(new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

            }
        });
        return executor;
    }




}
