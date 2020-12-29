package com.ldd.providerimpl.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ldd.api.TestService;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author: Xrf
 * @Description:
 * @Date: create in 2020/12/29 15:26
 */

@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Override
    public String sayHello(String value) {
        log.error("call say hello, {}", value);
        return "hello, " + value;

    }
}
