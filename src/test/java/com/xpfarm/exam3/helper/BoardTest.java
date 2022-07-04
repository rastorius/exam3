package com.xpfarm.exam3.helper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BoardTest {
    static final String EOL = System.lineSeparator();

    @Test
    @DisplayName("GIVEN new board WHEN print THEN should return empty board'")
    void shouldReturnEmptyBoard() {
        // given
        Board board = new Board();
        String expectedResult = " | | " + EOL
                + "-+-+-" + EOL
                + " | | " + EOL
                + "-+-+-" + EOL
                + " | | " + EOL;

        // when
        String actualResult = board.print();

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("GIVEN new board and [1,1] marked with X WHEN print THEN should return correct board'")
    void shouldReturnCorrectBoardAfterMark() {
        // given
        Board board = new Board();
        board.mark(1, 1, Symbol.X);
        String expectedResult = " | | " + EOL
                + "-+-+-" + EOL
                + " |X| " + EOL
                + "-+-+-" + EOL
                + " | | " + EOL;

        // when
        String actualResult = board.print();

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
