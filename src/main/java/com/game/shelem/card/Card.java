package com.game.shelem.card;

import com.game.shelem.enumuration.CardType;
import com.game.shelem.score.Score;
import lombok.Data;

@Data
public class Card {
    private String name;
    private Score score;
    private CardType type;
    private boolean isVerdict = false;
    private boolean isPlayed = false;
}
