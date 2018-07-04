package com.eureka.client.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static Logger log = Logger.getLogger(HelloController.class.getClass());

    @RequestMapping("/info")
    public String Hello(){
        // 记录debug级别的信息
        log.debug("This is debug message.");
        // 记录info级别的信息
        log.info("This is info message.");
        // 记录error级别的信息
        log.error("This is error message.");
        return "hello，this is wordLadder_client";
    }

}