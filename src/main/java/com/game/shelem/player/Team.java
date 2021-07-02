package com.game.shelem.player;

import lombok.Data;

import java.util.Set;

@Data
public class Team {
    private Set<Player> teammates;

    Team(Player first, Player second) {
        teammates.add(first);
        teammates.add(second);
    }


}
