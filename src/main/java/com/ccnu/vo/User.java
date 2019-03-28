package com.ccnu.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * created by 董乐强 on 2019/3/28
 */
@Data
public class User {
    @Value("${name}")
    private String username;
    private String password;
    private Integer age;
    @Value("${httpUrl}")
    private String url;
}
