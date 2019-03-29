package com.ccnu.app;

import com.ccnu.configure.DBConfig1;
import com.ccnu.configure.DBConfig2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * created by 董乐强 on 2019/3/27
 * 简化springboot启动，只需要一个@SpringBootApplication注解，即可启动SpringBoot
 *  @MapperScan是集成mybatis的时候，需要扫描mapper包里面的接口。
 */
@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
@MapperScan("com.ccnu.mapper")
@EnableAsync
@SpringBootApplication(scanBasePackages = "com.ccnu.*")
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
