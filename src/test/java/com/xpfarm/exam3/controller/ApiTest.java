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

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = Exam3Application.class, loader = SpringBootContextLoader.class)
@AutoConfigureMockMvc
class ApiTest {

    static final String EOL = System.lineSeparator();

    @Autowired
    MockMvc mockMvc;

    @Test
    @DisplayName("GIVEN tic-tac-toe url WHEN requesting bot game THEN should return game output")
    void shouldReturnGameOutput() throws Exception {
        // given

        // when
        ResultActions resultActions = mockMvc.perform(
                get("/api/bot-game")
        );

        // then
        resultActions.andExpect(status().isOk());

        String response = resultActions.andReturn().getResponse().getContentAsString();
        assertThat(response).containsAnyOf(
                "Player X:" + EOL,
                "Player O:" + EOL,
                "GAME ENDS WITH A DRAW!" + EOL
        );
    }
}
