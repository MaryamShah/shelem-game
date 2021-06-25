package com.game.shelem.table;

import com.game.shelem.card.Card;
import com.game.shelem.player.Team;
import lombok.Data;
import java.util.Set;

@Data
public class Table {
    private Card trumpCard;  // hokm
    private Set<Team> teams;
    private boolean done = false;
}
