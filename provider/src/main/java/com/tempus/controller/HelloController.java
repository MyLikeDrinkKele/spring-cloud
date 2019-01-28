package com.tempus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author : bin
 * @date :  create in  16:24 2019/1/25
 */
@RestController
public class HelloController {
    @Qualifier("eurekaRegistration")
    @Autowired
    private Registration registration;

    @Autowired
    private DiscoveryClient client;

    //@RequestMapping(value = "hello", method = RequestMethod.GET)
    @GetMapping
    public String hello() {
        List<ServiceInstance> instances = client.getInstances("eureka-client-provider");
        if (null != instances && instances.size() > 0) {
            System.out.println("接收到服务请求");
        }
        return "hello spring cloud!";
    }

}
