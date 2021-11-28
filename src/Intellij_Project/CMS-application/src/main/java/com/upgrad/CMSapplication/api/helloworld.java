package com.upgrad.CMSapplication.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloworld {
    @RequestMapping("/")
    public String sayhello(){
        return "hello world";
    }
}
