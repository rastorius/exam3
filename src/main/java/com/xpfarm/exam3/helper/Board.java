package com.xpfarm.exam3.helper;

public class Board {
    static final String EOL = System.lineSeparator();
    static final String EMPTY_LINE = " | | ";

    public String print() {
        return EMPTY_LINE + EOL
                + "-+-+-" + EOL
                + EMPTY_LINE + EOL
                + "-+-+-" + EOL
                + EMPTY_LINE + EOL;
    }
}
