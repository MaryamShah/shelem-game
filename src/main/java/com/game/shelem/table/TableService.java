package com.game.shelem.table;

import com.game.shelem.card.Card;
import com.game.shelem.card.CardService;
import com.game.shelem.player.Player;
import com.game.shelem.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.Set;

public class TableService {
    @Autowired
    private PlayerService playerService;
    @Autowired
    private CardService cardService;


    public Table start() {
        Table table = new Table();
        int index = 0;

        Set<Player> players = playerService.getAllPlayers();
        Map<Integer, Set<Card>> cardGroup = cardService.shuffle();
        for (Player player : players) {
            player.setCards(cardGroup.get(index));
            index++;
        }

        table.setTeams(playerService.setTeammates(players));
        table.setTableCards(cardGroup.get(index));
        return table;
    }
}
