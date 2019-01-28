package com.tempus.controller;

import com.tempus.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : bin
 * @date :  create in  17:00 2019/1/25
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String helloConsumer() {
        return helloService.getHello();
    }
}
