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
    @DisplayName("GIVEN new board and [1,1] marked with X"
            + "WHEN print"
            + "THEN should return correct board'")
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

    @Test
    @DisplayName("GIVEN X won with [0,1,2] WHEN isGameEnded THEN should return true'")
    void shouldReturnGameEnded() {
        // given
        Board board = new Board();
        board.mark(0, 0, Symbol.X);
        board.mark(1, 2, Symbol.O);
        board.mark(0, 1, Symbol.X);
        board.mark(1, 1, Symbol.O);
        board.mark(0, 2, Symbol.X);

        // when
        Boolean actualResult = board.isGameEnded();

        // then
        assertThat(actualResult).isTrue();
    }

    @Test
    @DisplayName("GIVEN X won with [3,4,5] WHEN isGameEnded THEN should return true'")
    void shouldReturnGameEnded2() {
        // given
        Board board = new Board();
        board.mark(1, 0, Symbol.X);
        board.mark(0, 2, Symbol.O);
        board.mark(1, 1, Symbol.X);
        board.mark(0, 1, Symbol.O);
        board.mark(1, 2, Symbol.X);

        // when
        Boolean actualResult = board.isGameEnded();

        // then
        assertThat(actualResult).isTrue();
    }

    @Test
    @DisplayName("GIVEN X won with [6,7,8] WHEN isGameEnded THEN should return true'")
    void shouldReturnGameEnded3() {
        // given
        Board board = new Board();
        board.mark(2, 0, Symbol.X);
        board.mark(0, 2, Symbol.O);
        board.mark(2, 1, Symbol.X);
        board.mark(0, 1, Symbol.O);
        board.mark(2, 2, Symbol.X);

        // when
        Boolean actualResult = board.isGameEnded();

        // then
        assertThat(actualResult).isTrue();
    }

    @Test
    @DisplayName("GIVEN X won with [0,3,6] WHEN isGameEnded THEN should return true'")
    void shouldReturnGameEnded4() {
        // given
        Board board = new Board();
        board.mark(1, 0, Symbol.X);
        board.mark(0, 2, Symbol.O);
        board.mark(2, 0, Symbol.X);
        board.mark(0, 1, Symbol.O);
        board.mark(0, 0, Symbol.X);

        // when
        Boolean actualResult = board.isGameEnded();

        // then
        assertThat(actualResult).isTrue();
    }

    @Test
    @DisplayName("GIVEN X won with [1,4,7] WHEN isGameEnded THEN should return true'")
    void shouldReturnGameEnded5() {
        // given
        Board board = new Board();
        board.mark(1, 1, Symbol.X);
        board.mark(0, 0, Symbol.O);
        board.mark(2, 1, Symbol.X);
        board.mark(1, 0, Symbol.O);
        board.mark(0, 1, Symbol.X);

        // when
        Boolean actualResult = board.isGameEnded();

        // then
        assertThat(actualResult).isTrue();
    }

    @Test
    @DisplayName("GIVEN X won with [2,5,8] WHEN isGameEnded THEN should return true'")
    void shouldReturnGameEnded6() {
        // given
        Board board = new Board();
        board.mark(0, 2, Symbol.X);
        board.mark(0, 0, Symbol.O);
        board.mark(1, 2, Symbol.X);
        board.mark(1, 0, Symbol.O);
        board.mark(2, 2, Symbol.X);

        // when
        Boolean actualResult = board.isGameEnded();

        // then
        assertThat(actualResult).isTrue();
    }

    @Test
    @DisplayName("GIVEN X won with [0,4,8] WHEN isGameEnded THEN should return true'")
    void shouldReturnGameEnded7() {
        // given
        Board board = new Board();
        board.mark(0, 0, Symbol.X);
        board.mark(0, 2, Symbol.O);
        board.mark(1, 1, Symbol.X);
        board.mark(1, 0, Symbol.O);
        board.mark(2, 2, Symbol.X);

        // when
        Boolean actualResult = board.isGameEnded();

        // then
        assertThat(actualResult).isTrue();
    }

    @Test
    @DisplayName("GIVEN X won with [2,4,6] WHEN isGameEnded THEN should return true'")
    void shouldReturnGameEnded8() {
        // given
        Board board = new Board();
        board.mark(0, 2, Symbol.X);
        board.mark(1, 2, Symbol.O);
        board.mark(1, 1, Symbol.X);
        board.mark(1, 0, Symbol.O);
        board.mark(2, 0, Symbol.X);

        // when
        Boolean actualResult = board.isGameEnded();

        // then
        assertThat(actualResult).isTrue();
    }

    @Test
    @DisplayName("GIVEN board is full WHEN isFull THEN should return true'")
    void shouldReturnBoardFull() {
        // given
        Board board = new Board();
        board.mark(0, 0, Symbol.X);
        board.mark(0, 2, Symbol.O);
        board.mark(0, 1, Symbol.X);
        board.mark(1, 0, Symbol.O);
        board.mark(2, 0, Symbol.X);
        board.mark(1, 1, Symbol.O);
        board.mark(2, 1, Symbol.X);
        board.mark(2, 2, Symbol.O);
        board.mark(1, 2, Symbol.X);

        // when
        Boolean actualResult = board.isFull();

        // then
        assertThat(actualResult).isTrue();
    }

    @Test
    @DisplayName("GIVEN board and [0,0] marked X WHEN isPositionEmpty THEN should return false")
    void shouldReturnPositionNotEmpty() {
        // given
        Board board = new Board();
        board.mark(0, 0, Symbol.X);

        // when
        Boolean actualResult = board.isPositionEmpty(0, 0);

        // then
        assertThat(actualResult).isFalse();
    }
}
