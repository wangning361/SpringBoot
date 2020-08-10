package com.wangning.scw.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wangning     
 * @version V1.0.0
 * @description    springboot 启动类  
 * @date   2020/8/9 18:25  
 * @copyright 2020
 *  
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.wangning"})
public class ScwSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScwSpringBootApplication.class, args);
    }


}
