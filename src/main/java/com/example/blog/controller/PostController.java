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
        return "haha";
    }
    // HTTP 메소드 :  GET POST PUT PATCH DELETE OPTIONS HEAD TRACE CONNECT
    // 글 등록을 하는데 POST 메소드를 사용할 것

    @PostMapping("/posts")
    public String post(@RequestBody PostCreate params) throws Exception {
        log.info("params={}",params.toString());
        String title = params.title;
        String content = params.content;


        /// 이런 식의 에러 확인은 너무 노가다
        /// 1.힘들다. 2. 무언가 3번 이상 반복잗업을 할떄 내가 뭔가 잘못하고 있는건 아닐지 의심한다.
        /// 3.누락될 수 있다. 4. 생각보다 검증해야할게 많다.(중요)
        /// 5.꼼꼼하지 않을 수 있다.
        if (title ==null || title.equals(""))
        {
            throw new Exception("타이틀 값이 없어요~!");
        }
        else if (content ==null ||content.equals(""))
        {
            throw new Exception("내용이 없어요");
        }



        return "Hello World";


    }







}
