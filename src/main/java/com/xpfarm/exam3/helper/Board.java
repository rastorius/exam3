package com.xpfarm.exam3.helper;

import java.util.ArrayList;
import java.util.List;

public class Board {
    static final String EOL = System.lineSeparator();

    List<Symbol> symbols = new ArrayList<>(
            List.of(Symbol.EMPTY, Symbol.EMPTY, Symbol.EMPTY,
                    Symbol.EMPTY, Symbol.EMPTY, Symbol.EMPTY,
                    Symbol.EMPTY, Symbol.EMPTY, Symbol.EMPTY));

    public String print() {
        return symbols.get(0).getValue() + "|"
                + symbols.get(1).getValue() + "|"
                + symbols.get(2).getValue() + EOL
                + "-+-+-" + EOL
                + symbols.get(3).getValue() + "|"
                + symbols.get(4).getValue() + "|"
                + symbols.get(5).getValue() + EOL
                + "-+-+-" + EOL
                + symbols.get(6).getValue() + "|"
                + symbols.get(7).getValue() + "|"
                + symbols.get(8).getValue() + EOL;
    }

    public void mark(int x, int y, Symbol symbol) {
        symbols.set(x * 3 + y, symbol);
    }

    public boolean isGameEnded() {
        return hasHorizontalWon()
                || hasVerticalWon();
    }

    private boolean hasHorizontalWon() {
        return hasLineWon(0, 1, 2)
                || hasLineWon(3, 4, 5)
                || hasLineWon(6, 7, 8);
    }

    private boolean hasVerticalWon() {
        return hasLineWon(0, 3, 6)
                || hasLineWon(1, 4, 7);
    }

    private boolean hasLineWon(int a, int b, int c) {
        return symbols.get(a) != Symbol.EMPTY
                && hasLineSameSymbols(a, b, c);
    }

    private boolean hasLineSameSymbols(int a, int b, int c) {
        return symbols.get(a) == symbols.get(b)
                && symbols.get(b) == symbols.get(c);
    }
}
