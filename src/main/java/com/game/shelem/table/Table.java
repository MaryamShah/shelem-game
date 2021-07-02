package com.game.shelem.table;

import com.game.shelem.card.Card;
import com.game.shelem.card.CardService;
import com.game.shelem.player.Player;
import com.game.shelem.player.PlayerService;
import com.game.shelem.player.Team;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class Table {
    @Autowired
    private PlayerService playerService;
    @Autowired
    private CardService cardService;

    private Card trumpCard;  // hokm
    private Set<Team> teams;
    private boolean done = false;

    public StartServiceRes start() {
        StartServiceRes response = new StartServiceRes();
        int index = 0;

        Set<Player> players = playerService.getAllPlayers();
        Map<Integer, Set<Card>> cardGroup = cardService.shuffle();
        for (Player player : players) {
            player.setCards(cardGroup.get(index));
            index++;
        }

        response.setTeammates(playerService.setTeammates(players));
        response.setTableCards(cardGroup.get(index));
        return response;
    }
}
