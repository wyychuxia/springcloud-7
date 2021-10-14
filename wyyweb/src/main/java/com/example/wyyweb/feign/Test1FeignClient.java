package com.example.wyyweb.feign;

import com.example.wyyweb.hystrix.Test1FeignClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="wyyserver-service",fallback = Test1FeignClientHystrix.class)
public interface Test1FeignClient {

    @RequestMapping("/test/get1")
    public String get1(@RequestParam("name") String name);
}
