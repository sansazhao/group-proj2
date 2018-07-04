package com.eureka.client.controller;

import com.eureka.client.service.FindLadderService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {
    private static Logger log = Logger.getLogger(IndexController.class.getClass());

    @RequestMapping(value = "/")
    public String home(@RequestParam("word1")String word1,
                       @RequestParam("word2")String word2,
                       @RequestParam("filename")String filename){
        FindLadderService wl = new FindLadderService();
        String answer="";
        try {
            answer = wl.GetLadder(filename,word1,word2).getLadder();
            // 记录debug级别的信息
            log.debug("This is debug message.");
            // 记录info级别的信息
            log.info("This is info message.");
            // 记录error级别的信息
            log.error("This is error message.");
        }catch(Exception e) {
            log.error("true error occured");
        }
        return answer;
    }

}
