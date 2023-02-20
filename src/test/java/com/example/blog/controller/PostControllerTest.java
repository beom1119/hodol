package com.example.blog.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest             ///해당 어노테이션 없이 MockMVC 의존성 주입을 하면 불가능
class PostControllerTest {

    @Autowired
    private MockMvc mockMvc;
    //perform()
    //요청을 전송하는 역할을 합니다. 결과로 ResultActions 객체를 받으며
    // ResultActions 객체는 리턴 값을 검증하고 확인할 수 있는 andExcpect() 메소드를 제공해줍니다.
    // https://shinsunyoung.tistory.com/52

    @Test
    @DisplayName("post 요청 시 Hello World 출력하는지 확인한다.")
    void test() throws Exception {
        // 글 제목
        // 글 내용

        // expected
        mockMvc.perform(MockMvcRequestBuilders.post("/posts")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\" : \"제목입니다.\", \"content\":\"내용입니다.\"}")
                )   //applicataion/json 형식으로 보낸다.
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello World"))
                .andDo(MockMvcResultHandlers.print());
    }



    @Test
    @DisplayName("post 요청 TITLE 값은 필수다.")
    void test2() throws Exception {
        // 글 제목
        // 글 내용

        // expected
        mockMvc.perform(MockMvcRequestBuilders.post("/posts")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"title\" : \"\", \"content\":\"내용입니다.\"}")
                )   //applicataion/json 형식으로 보낸다.
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello World"))
                .andDo(MockMvcResultHandlers.print());
    }




}


/// MockMVC란 아주  기초적인 테스트 코드로서 가짜 요청을 만들어 더욱 테스트 하기 쉽게 사용하는 것.
//validate
