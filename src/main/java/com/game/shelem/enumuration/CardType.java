package com.game.shelem.enumuration;

public enum CardType {
    ORDINARY("ORDINARY", 0),
    FIVE_SCORE("FIVE_SCORE", 5),
    TEN_SCORE("TEN_SCORE", 10);

    private int value;
    private String name;

    CardType(String name, int value) {
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
