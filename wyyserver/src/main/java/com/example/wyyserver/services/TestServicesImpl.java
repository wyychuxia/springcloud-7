package com.example.wyyserver.services;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class TestServicesImpl implements TestServices{
    @Override
    public String get(String name) {
        System.out.println("service 3"+name);
        return "参数name：" + name;
    }

    @Override
    public String get1(String name) throws Exception {

            //此处睡眠50秒
            Thread.sleep(70000);
            new Exception("dd");

        return "参数 server get1 name：" + name;
    }
}
