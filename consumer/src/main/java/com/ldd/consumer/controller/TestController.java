package com.ldd.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ldd.api.TestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Xrf
 * @Description:
 * @Date: create in 2020/12/29 15:44
 */

@RestController
public class TestController {

    @Reference
    TestService testService;

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public String sayHello(@PathVariable("name") String name) {
        return testService.sayHello(name);
    }

}
