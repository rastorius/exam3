package com.xpfarm.exam3.helper;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GameTest {
    @Test
    @DisplayName("GIVEN new game WHEN getState THEN should return IN_PROGRESS")
    void shouldReturnInProgress() {
        // given
        Game game = new Game();
        game.init();
        GameState expectedResult = GameState.IN_PROGRESS;

        // when
        GameState actualResult = game.getState();

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("GIVEN draw WHEN getState THEN should return GAME_OVER")
    void shouldReturnGameOver() {
        // given
        Game game = new Game();
        GameState expectedResult = GameState.GAME_OVER;
        game.init();
        game.step(0, 0);
        game.step(0, 2);
        game.step(0, 1);
        game.step(1, 0);
        game.step(2, 0);
        game.step(1, 1);
        game.step(2, 1);
        game.step(2, 2);
        game.step(1, 2);

        // when
        GameState actualResult = game.getState();

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    @Test
    @DisplayName("GIVEN X won WHEN getState THEN should return GAME_OVER")
    void shouldReturnGameOver2() {
        // given
        Game game = new Game();
        GameState expectedResult = GameState.GAME_OVER;
        game.init();
        game.step(0, 0);
        game.step(1, 2);
        game.step(0, 1);
        game.step(1, 0);
        game.step(0, 2);
        // when
        GameState actualResult = game.getState();

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
