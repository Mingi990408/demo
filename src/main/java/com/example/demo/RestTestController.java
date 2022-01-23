package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestTestController{
    @RequestMapping("/Test")
    public String restTest(){
        return " : Rest Test 완료!!!";
    }
}
