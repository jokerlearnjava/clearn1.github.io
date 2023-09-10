package com.atguigu.docker_boot;

import com.atguigu.docker_boot.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;


// Generated by https://start.springboot.io
// 优质的 spring/boot/data/security/cloud 框架中文文档尽在 => https://springdoc.cn

@SpringBootApplication
@MapperScan("com.atguigu.docker_boot.mapper") //import tk.mybatis.spring.annotation.MapperScan;
public class DockerBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DockerBootApplication.class, args);


    }

}