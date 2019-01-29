package com.tempus.service.impl;

import com.tempus.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author : bin
 * @date :  create in  14:09 2019/1/29
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHello() {
        return "sorry error!!!";
    }
}
