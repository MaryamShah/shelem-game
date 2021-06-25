package com.game.shelem.card;

import com.game.shelem.enumuration.CardType;
import lombok.Data;

@Data
public class Card {
    private String name;
    private CardType type;
    private boolean isPlayed = false;
}
