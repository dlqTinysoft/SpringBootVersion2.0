package com.ccnu.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * created by 董乐强 on 2019/3/27
 *
 * SpringBoot启动入口
 */

@EnableAutoConfiguration
@ComponentScan("com.ccnu.controller")
public class App {

    /**
     * 使用@EnableAutoConfiguration来加载一些配置
     *  注意：@EnableAutoConfiguration只会扫描当前类下的@RestController注解，所以需要加入
     * @ComponentScan 注解，来指定需要扫描的包。
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
