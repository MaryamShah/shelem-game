package com.game.shelem.game;

import com.game.shelem.player.Player;
import com.game.shelem.table.Round;
import lombok.Data;
import java.util.Set;

@Data
public class Game {
    private Set<Round> rounds;
    private Set<Player> players;

}
