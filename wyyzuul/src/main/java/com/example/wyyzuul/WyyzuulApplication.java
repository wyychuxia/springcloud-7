package com.example.wyyzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableEurekaClient
public class WyyzuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(WyyzuulApplication.class, args);
    }

}
