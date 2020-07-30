package com.dubbo.dubbotm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
public class DubboTmConsumApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboTmConsumApplication.class, args);
    }

}
