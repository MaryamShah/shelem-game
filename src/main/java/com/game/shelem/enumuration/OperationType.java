package com.game.shelem.enumuration;

public enum OperationType {

    SHUFFLE("SHUFFLE", 0),
    PLAY_CARD("PLAY_CARD", 1),
    PLAYER_TURN("PLAYER_TURN", 2),
    TOTAL_SCORE_CALCULATION("TOTAL_SCORE_CALCULATION", 3),
    BUZZ("BUZZ", 4),
    WINNER_CALCULATION("WINNER_CALCULATION",5);

    private int value;
    private String name;

    OperationType(String name, int value) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
