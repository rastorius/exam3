package com.xpfarm.exam3.helper;

public class MessageGenerator {
    static final String EOL = System.lineSeparator();

    public String printBoardCreationHeader() {
        return "Game Board Creation..." + EOL;
    }

    public String printBoardCreationFooter() {
        return "Board Created." + EOL
                + "The game will start with player X" + EOL;
    }

    public String printStepHeader(Symbol playerSymbol) {
        return "Player " + playerSymbol.getValue() + ":" + EOL;
    }

    public String printWonFooter(Symbol playerSymbol) {
        return "PLAYER " + playerSymbol.getValue() + " WON!" + EOL;
    }

    public String printDraw() {
        return null;
    }
}
