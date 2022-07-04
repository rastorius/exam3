package com.xpfarm.exam3.helper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoardTest {
    static final String eol = System.lineSeparator();

    @Test
    @DisplayName("GIVEN new board WHEN print THEN should return empty board'")
    void shouldReturnHelloWorld() {
        // given
        Board board = new Board();
        String expectedResult = " | | " + eol
                + "-+-+-" + eol
                + " | | " + eol
                + "-+-+-" + eol
                + " | | " + eol;

        // when
        String actualResult = board.print();

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
