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
}
