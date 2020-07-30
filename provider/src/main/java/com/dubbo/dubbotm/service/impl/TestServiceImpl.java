package com.dubbo.dubbotm.service.impl;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.common.json.JSONObject;
import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.dubbotm.service.TestService;

import java.io.IOException;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2020/3/12 19:29
 * Version 1.0
 **/
@Service(timeout = 200000,version = "1.0")
public class TestServiceImpl implements TestService {
    @Override
    public String testDubbo() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("key",System.currentTimeMillis()+"");
        String value = null;
        try {
            value = JSON.json(jsonObject);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
