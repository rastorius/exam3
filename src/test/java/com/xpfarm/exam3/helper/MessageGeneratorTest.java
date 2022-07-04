package com.xpfarm.exam3.helper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MessageGeneratorTest {

    static final String EOL = System.lineSeparator();

    @Test
    @DisplayName("GIVEN new message generator WHEN print board creation header THEN should return correct message")
    void shouldReturnHelloWorld() {
        // given
        MessageGenerator messageGenerator = new MessageGenerator();
        String expectedResult = "Game Board Creation..." + EOL;

        // when
        String actualResult = messageGenerator.printNewGameHeader();

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
