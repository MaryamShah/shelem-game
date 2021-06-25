package com.game.shelem.enumuration;

public enum CardType {
    ORDINARY("ORDINARY_CARD", 0),
    FIVE_POINT("FIVE_POINT_CARD", 5),
    TEN_POINT("TEN_POINT_CARD", 10);

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
