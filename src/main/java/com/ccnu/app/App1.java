package com.ccnu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * created by 董乐强 on 2019/3/27
 * 简化springboot启动，只需要一个@SpringBootApplication注解，即可启动SpringBoot
 */

@SpringBootApplication(scanBasePackages = "com.ccnu.controller")
public class App1 {

    /**
     * @SpringBootApplication 只会扫描同一包下的以及子包下的类
     * 要扫描指定的包，需要加上参数 scanBasePackages
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(App1.class,args);
    }


}
