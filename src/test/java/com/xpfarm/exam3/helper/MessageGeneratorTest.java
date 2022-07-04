package com.xpfarm.exam3.helper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MessageGeneratorTest {

    static final String EOL = System.lineSeparator();

    @Test
    @DisplayName("GIVEN new message generator WHEN print board creation header THEN should return correct message")
    void shouldReturnCorrectBoardCreationHeader() {
        // given
        MessageGenerator messageGenerator = new MessageGenerator();
        String expectedResult = "Game Board Creation..." + EOL;

        // when
        String actualResult = messageGenerator.printBoardCreationHeader();

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("GIVEN new message generator WHEN print board creation footer THEN should return correct message")
    void shouldReturnCorrectBoardCreationFooter() {
        // given
        MessageGenerator messageGenerator = new MessageGenerator();
        String expectedResult = "Board Created." + EOL
                + "The game will start with player X" + EOL;

        // when
        String actualResult = messageGenerator.printBoardCreationFooter();

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("GIVEN player symbol WHEN print step header THEN should return correct message")
    void shouldReturnCorrectStepHeader() {
        // given
        MessageGenerator messageGenerator = new MessageGenerator();
        Symbol playerSymbol = Symbol.X;
        String expectedResult = "Player " + playerSymbol.getValue() + ":" + EOL;

        // when
        String actualResult = messageGenerator.printStepHeader(playerSymbol);

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
