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
}