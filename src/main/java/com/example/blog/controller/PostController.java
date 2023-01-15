package com.example.blog.controller;


import com.example.blog.request.PostCreate;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


//SSR : JSP, thymeleaf, Mustache
//  서버에서 랜더링을 진행 후 랜더링 해준다.
//SRA : Vue, React, API
//  자바스크립트 + API(JSON)

@Slf4j
@RestController
public class PostController {

    @GetMapping("/hello")
    public String get()
    {
        return "Hello World";
    }
    // HTTP 메소드 :  GET POST PUT PATCH DELETE OPTIONS HEAD TRACE CONNECT
    // 글 등록을 하는데 POST 메소드를 사용할 것

    @PostMapping("/posts")
    public String post(@RequestBody PostCreate params)
    {
        log.info("params={}",params.toString());
        return "Hello World";
    }







}
