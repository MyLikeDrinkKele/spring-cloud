package com.tempus.service;

import com.tempus.service.impl.HelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author : bin
 * @date :  create in  10:57 2019/1/29
 */
@FeignClient(value = "eureka-client-provider", fallback = HelloServiceImpl.class)
public interface HelloService {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String getHello();
}
