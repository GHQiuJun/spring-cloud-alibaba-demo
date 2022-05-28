package com.demo.service2.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @program: MemberService
 * @description:
 * @author: 60007949
 * @create: 2022-05-28 14:56
 **/
@Service
public class MemberService {

    @SentinelResource(value = "sayHello", fallback = "sayHelloFail")
    public String sayHello() {
        return "Hello, Member! ";
    }

    public String sayHello1() {
        return "Hello, Member! ";
    }

    public String sayHelloFail() {
        return "I am sorry, Member! ";
    }

}
