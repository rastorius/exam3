package com.xpfarm.exam3.helper;

public class MessageGenerator {
    static final String EOL = System.lineSeparator();

    String printBoardCreationHeader() {
        return "Game Board Creation..." + EOL;
    }

    String printBoardCreationFooter() {
        return "The game will start with player X" + EOL;
    }
}
