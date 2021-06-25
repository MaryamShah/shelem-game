package com.game.shelem.table;

import com.game.shelem.card.Card;
import com.game.shelem.player.Player;
import lombok.Data;

import java.util.Set;

@Data
public class Round {
    private Card verdictCard;
    private Integer winnerTotalScore;
    private Set<Player> winnerPlayerSet;
    boolean isDone = false;
}
