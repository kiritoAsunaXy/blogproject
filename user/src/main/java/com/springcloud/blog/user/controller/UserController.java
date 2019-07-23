package com.springcloud.blog.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

   private final Logger logger = LoggerFactory.getLogger(UserController.class);

   @RequestMapping("/test")
   @ResponseBody
    public String testapi(@RequestParam(required = false,value = "name") String name){
        if(name != null) {
            logger.info("测 试 成 功 ! " + name);
        }else {
            logger.info("测 试 失 败 ! ");
        }
        return name+"ok";
    }
}
