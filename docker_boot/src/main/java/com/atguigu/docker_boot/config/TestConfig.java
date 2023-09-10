package com.atguigu.docker_boot.config;

import com.atguigu.docker_boot.entities.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    @Bean
    public Person person(){
        return new Person("张三",1);
    }

}
