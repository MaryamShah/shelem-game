package com.game.shelem.table;

import com.game.shelem.card.Card;
import com.game.shelem.player.Team;
import lombok.Data;

import java.util.Map;
import java.util.Set;

@Data
public class Table {

    private Card trumpSuit;  // hokm
    private Set<Card> tableCards;
    private Map<Integer, Team> teams;
    private boolean done = false;


}
