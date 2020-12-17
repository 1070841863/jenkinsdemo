package com.test.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author study
 * @create 2020-12-17 14:28
 */
@RestController
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "123";
    }
}
