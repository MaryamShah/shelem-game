package com.game.shelem.enumuration;

public enum OperationType {

    REGISTER_PLAYER("REGISTER_PLAYER",0),
    SHUFFLE("SHUFFLE", 1),
    PLAY_CARD("PLAY_CARD", 2),
    PLAYER_TURN("PLAYER_TURN", 3),
    TOTAL_SCORE_CALCULATION("TOTAL_SCORE_CALCULATION", 4),
    BUZZ("BUZZ", 5),
    WINNER_CALCULATION("WINNER_CALCULATION",6);

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
