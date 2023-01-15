package com.example.blog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//SSR : JSP, thymeleaf, Mustache
//  서버에서 랜더링을 진행 후 랜더링 해준다.
//SRA : Vue, React, API
//  자바스크립트 + API(JSON)

@RestController
public class PostController {

    @GetMapping("/v1/posts")
    public String get()
    {
        return "Hello World";
    }

}
