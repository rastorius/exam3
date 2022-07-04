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
        return symbols.get(0).getValue() + "|" + symbols.get(1).getValue() + "|" + symbols.get(2).getValue() + EOL
                + "-+-+-" + EOL
                + symbols.get(3).getValue() + "|" + symbols.get(4).getValue() + "|" + symbols.get(5).getValue() + EOL
                + "-+-+-" + EOL
                + symbols.get(6).getValue() + "|" + symbols.get(7).getValue() + "|" + symbols.get(8).getValue() + EOL;
    }

    public void mark(int x, int y, Symbol symbol) {
        symbols.set(x * 3 + y, symbol);
    }
    
    public Boolean isGameEnded() {
        return false;
    }
}
