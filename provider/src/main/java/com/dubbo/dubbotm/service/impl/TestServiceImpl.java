package com.dubbo.dubbotm.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.dubbotm.service.TestService;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2020/3/12 19:29
 * Version 1.0
 **/
@Service(timeout = 2000,version = "1.0")
public class TestServiceImpl implements TestService {
    @Override
    public String testDubbo() {
        return "123123";
    }
}
