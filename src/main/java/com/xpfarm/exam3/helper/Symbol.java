package com.xpfarm.exam3.helper;

public enum Symbol {
    EMPTY(" "), X("X"), O("O");

    private final String value;

    Symbol(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
