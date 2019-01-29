package com.tempus.controller;

import com.tempus.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : bin
 * @date :  create in  11:00 2019/1/29
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String getHello() {
        return helloService.getHello();
    }
}
