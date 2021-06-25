package com.game.shelem.player;

import com.game.shelem.exception.ShelemApplicationException;

import java.util.*;

public class PlayerService {
    private static Set<Player> players = new HashSet<>();
    private static int index = 0;
    private List<String> firstNameList = Arrays.asList("Behdad", "Mahmood", "Hesam", "Milad");
    private List<String> lastNameList = Arrays.asList("Moodi", "ShahRokni", "Banakar", "Mohseni");

    public Player registerPlayer() {
        if (players != null && players.size() < 4) {
            Player player = new Player.PlayerBuilder(firstNameList.get(index), lastNameList.get(index)).build();
            players.add(player);
            index++;
            return player;
        }
        throw new ShelemApplicationException("All players are set. Let's play the game!");
    }

    public Map<Integer, Set<Player>> groupPlayers(Set<Player> allPlayers) {
        return null;
    }

    public Integer calculatePlayerScoreIndividually() {
        return 0;
    }

    public Integer calculateGroupScore(Set<Player> groupPlayers) {
        return 0;
    }
}
