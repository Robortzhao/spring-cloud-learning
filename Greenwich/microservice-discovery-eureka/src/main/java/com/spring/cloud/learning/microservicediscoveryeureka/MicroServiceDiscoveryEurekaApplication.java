package com.spring.cloud.learning.microservicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zhaoyanhai
 * @Description 使用Eureka做服务发现组件
 * @date 2019/10/7
 **/
@SpringBootApplication
@EnableEurekaServer
public class MicroServiceDiscoveryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroServiceDiscoveryEurekaApplication.class, args);
    }

}
