package com.upgrad.myfirstspringApp.api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hello {
@RequestMapping(value = "/")
    public String sayhello(){
            return "Hello world from the spring boot application";
}
}
