package com.demo.service2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 启动类
 *
 * @author 60007949
 */
@SpringBootApplication
@EnableFeignClients
public class Service2Application {

    public static void main(String[] args) {
        SpringApplication.run(Service2Application.class, args);
    }

}
