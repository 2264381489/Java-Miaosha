package com.mediaai.javamiaosha.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mediaai.javamiaosha.backend.dao")
public class javamiaoshaBackendApp {

    public static void main(String[] args) {
        SpringApplication.run(javamiaoshaBackendApp.class, args);
    }
}

