package com.example.wyyweb.controller;

import com.example.wyyserver.apis.TestServicesApis;
import com.example.wyyweb.feign.Test1FeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/test")
public class TestWebController {
    @Autowired
    private TestServicesApis testServicesApis;

    @Autowired
    private Test1FeignClient test1FeignClient;

    @Value("${aa.bb}")
    String value;

    @RequestMapping("/getTest")
    public String getTest(String name) {
        System.out.println("-----1--"+name);
        return testServicesApis.get("通过web端接口调用"+name);
    }

    @RequestMapping("/value")
    public String value() {
        return "value:"+value;
    }

    //测试 web feign+hystrix 超时熔断接口
    //测试 web 调用 server 项目 web 项目超时熔断机制
    @RequestMapping("/getTest1")
    public String getTest1(String name) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("---web--getTest1--"+name+"==web start="+df.format(System.currentTimeMillis()));
        String d = test1FeignClient.get1("通过web getTest1 端接口调用"+name);
        System.out.println("==web end="+df.format(System.currentTimeMillis()));

        return d;

    }

}
