package com.example.blog.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

class PostControllerTest {

    @Autowired
    private MockMvc mockMvc;


    @Test
    @DisplayName("/Posts 요청 시 Hello World를 출력하기")
    void test()
    {
        // expected
//        mockMvc.perform(MockMvcRequestBuilders.get("/posts")).andExpect(Mock)
    }

}