package com.wangning.scw.spring.boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangning     
 * @version V1.0.0
 * @description    配置  
 * @date   2020/8/10 12:36  
 * @copyright 2020
 *  
 */
@RestController
@RequestMapping("/config")
public class ConfigInfoController {

    @Value("${config.info}")
    private String configInfo;


    @GetMapping("/info")
    private String getInfo(){
        return configInfo;
    }

}
