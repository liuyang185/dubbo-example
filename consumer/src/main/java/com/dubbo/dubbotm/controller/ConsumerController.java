package com.dubbo.dubbotm.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.dubbotm.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2020/3/13 11:13
 * Version 1.0
 **/
@RestController
@RequestMapping("consumer")
public class ConsumerController {
    @Reference(version = "1.0")
    private TestService testService;
    @GetMapping(value = "testService")
    public Object testService(){
        return testService.testDubbo();
    }
}

