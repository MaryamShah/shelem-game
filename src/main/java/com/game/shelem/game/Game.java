package com.game.shelem.game;

import com.game.shelem.player.Team;
import com.game.shelem.score.Score;
import com.game.shelem.table.Table;
import lombok.Data;
import java.util.Set;

@Data
public class Game {
    private Set<Table> rounds;
    private Team winnerTeam;
    private Score winnerTotalScore;


}
