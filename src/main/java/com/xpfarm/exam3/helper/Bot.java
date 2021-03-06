package com.xpfarm.exam3.helper;

import java.security.SecureRandom;
import java.util.Random;

public class Bot {
    SecureRandom random = new SecureRandom();

    public String play() {
        Game game = new Game();
        StringBuilder output = new StringBuilder(System.lineSeparator());
        output.append(game.init());

        while (game.getState() == GameState.IN_PROGRESS) {
            step(game, output);
        }

        return output.toString();
    }

    private void step(Game game, StringBuilder output) {
        int position = getValidPosition(game, random);
        output.append(game.step(position / 3, position % 3));
    }

    private int getValidPosition(Game game, Random random) {
        int position = random.nextInt(9);
        while (!game.isStepPossible(position)) {
            position = random.nextInt(9);
        }
        return position;
    }
}
