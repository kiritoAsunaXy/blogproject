package com.springcloud.blog.article.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ArticleController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/dotest")
        public void dotest(@RequestParam(required =false,value = "name") String name){
        MultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
        map.add("name", name);
            String res = restTemplate.postForObject("http://USERMODULE/test",map,String.class);
            System.out.println(res);
    }
}
