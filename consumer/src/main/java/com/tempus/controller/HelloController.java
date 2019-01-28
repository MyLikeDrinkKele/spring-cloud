package com.tempus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : bin
 * @date :  create in  17:00 2019/1/25
 */
@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello")
    public String helloConsumer() {
        return restTemplate.getForEntity("http://EUREKA-CLIENT-PROVIDER/hello", String.class).getBody();
    }
}
