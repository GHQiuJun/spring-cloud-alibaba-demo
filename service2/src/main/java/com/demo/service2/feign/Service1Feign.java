package com.demo.service2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: Service1Feign
 * @description:
 * @author: 60007949
 * @create: 2022-05-28 15:59
 **/
@FeignClient("service1")
public interface Service1Feign {

    /**
     * sayHello
     */
    @GetMapping(value = "/service1/sayHello")
    void sayHello();
}
