package com.xpfarm.exam3.controller;

import com.xpfarm.exam3.Exam3Application;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = Exam3Application.class, loader = SpringBootContextLoader.class)
@AutoConfigureMockMvc
class ApiTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("GIVEN WHEN requesting hello THEN should return 'Hello World!'")
    void shouldReturnHelloWorld() throws Exception {
        // given
        String expectedResponse = "Hello World!";

        ResultActions resultActions = mockMvc.perform(
                get("/api/hello")
        );

        // then
        resultActions.andExpect(status().isOk());
        resultActions.andExpect(content().string(expectedResponse));
    }
}
