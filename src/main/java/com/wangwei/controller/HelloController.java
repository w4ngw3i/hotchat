package com.wangwei.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther wangwei
 * @Date 2018/12/12 1:41 PM
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello hotchat~~";
    }
}
