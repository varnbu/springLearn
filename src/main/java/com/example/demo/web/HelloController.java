package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private int number = 0;

    @RequestMapping("/hello")
    public String index() {
        this.number++;
        String str;
        str = "hello/" + this.number + "/v1";
        return str;
    }

    @RequestMapping("/hello/v2")
    public String index2() {
        this.number++;
        String str;
        str = "hello/" + this.number + "/v2";
        System.out.println("hello v2");
        return str;
    }
}
