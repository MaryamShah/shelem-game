package com.game.shelem.player;

import com.game.shelem.card.Card;
import com.game.shelem.score.Score;
import lombok.Data;
import java.util.Set;

@Data
public class Player {

    private String firstName;
    private String lastName;
    private boolean isRegnant = false;  //hAkem
    private boolean isPlaying = false;
    private Set<Card> cards;
    private Score score;
}
