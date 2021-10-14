package com.example.wyyserver.controller;

import com.example.wyyserver.services.TestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestServices testServices;

    @RequestMapping("/get")
    public String get(String name) {
        System.out.println("-----2--"+name);
        String s = testServices.get(name);
        return s;
    }

    @RequestMapping("/get1")
    public String get1(String name) throws Exception {

        //测试 web 调用 server 项目 web 项目超时熔断机制
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("--server--get1 start--"+name+"=="+df.format(System.currentTimeMillis()));
        String s = testServices.get1(name);
        System.out.println("--server--get1--end "+name+"=="+df.format(System.currentTimeMillis()));

        return s;
    }
}
