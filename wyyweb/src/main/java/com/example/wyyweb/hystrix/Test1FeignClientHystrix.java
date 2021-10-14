package com.example.wyyweb.hystrix;

import com.example.wyyweb.feign.Test1FeignClient;
import org.springframework.stereotype.Component;


public class Test1FeignClientHystrix implements Test1FeignClient {
    @Override
    public String get1(String name) {
       // return null;
        return "Test1FeignClientHystrix";
    }
}
