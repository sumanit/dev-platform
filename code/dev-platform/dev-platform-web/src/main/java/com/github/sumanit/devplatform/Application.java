package com.github.sumanit.devplatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author suman6
 * @version 1.0
 * @date 2020/6/13 7:15 下午
 */
@SpringBootApplication
@MapperScan(basePackages="com.github.sumanit.devplatform.mapper")
public class Application {
    public static void main(String[] args) {
        try {
            SpringApplication.run(Application.class,args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
