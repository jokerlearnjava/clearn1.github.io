package com.atguigu.docker_boot.controller;

import com.atguigu.docker_boot.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class DockerController {

    @Autowired
    Person person;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/order/docker")
    public String helloDocker(){
        return "hello docker" + "\t" + port + UUID.randomUUID().toString();
    }

    @RequestMapping(value = "/order/index",method = RequestMethod.GET)
    public String index(){
        return "服务端口号: " + "\t" + port + "  " +  UUID.randomUUID().toString() ;
    }

}
