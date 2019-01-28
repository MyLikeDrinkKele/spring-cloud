package com.tempus.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.hystrix.FallbackHandler;
import com.tempus.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author : bin
 * @date :  create in  9:15 2019/1/28
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error")
    @Override
    public String getHello() {
        return restTemplate.getForEntity("http://eureka-client-provider/hello", String.class).getBody();
    }

    public String error(){
        return "error";
    }
}
