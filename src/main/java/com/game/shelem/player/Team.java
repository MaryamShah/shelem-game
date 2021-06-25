package com.game.shelem.player;

import lombok.Data;

import java.util.Set;

@Data
public class Team {
    private Set<Player> teammates;
}
