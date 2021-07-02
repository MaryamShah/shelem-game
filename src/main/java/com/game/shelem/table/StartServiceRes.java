package com.game.shelem.table;

import com.game.shelem.card.Card;
import com.game.shelem.player.Team;
import lombok.Data;

import java.util.Map;
import java.util.Set;

@Data
public class StartServiceRes{
    private Map<Integer, Team> teammates;
    private Set<Card> tableCards;
}
