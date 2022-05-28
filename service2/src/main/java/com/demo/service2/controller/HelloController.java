package com.demo.service2.controller;

import com.demo.service2.service.MemberService;
import com.demo.service2.feign.Service1Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: HelloController
 * @description:
 * @author: 60007949
 * @create: 2022-05-28 14:59
 **/
@RestController
@RequestMapping(value = "/service2")
public class HelloController {

    @Resource
    private MemberService memberService;

    @Autowired
    private Service1Feign service1Feign;

    @RequestMapping("/sayHello")
    public String service() {
        return memberService.sayHello();
    }

    @RequestMapping("/sayHello1")
    public String service1() {
        return memberService.sayHello1();
    }

    @RequestMapping("/rpcTest")
    public void rpcTest() {
        service1Feign.sayHello();
    }

}
