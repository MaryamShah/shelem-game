package com.game.shelem.player;

import com.game.shelem.exception.ShelemApplicationException;

import java.util.*;
import java.util.stream.Collectors;

public class PlayerService {
    private static Set<Player> players = new HashSet<>();
    private static int index = 0;
    private List<String> firstNameList = Arrays.asList("Behdad", "Mahmood", "Hesam", "Milad");
    private List<String> lastNameList = Arrays.asList("Moodi", "ShahRokni", "Banakar", "Mohseni");

    public Set<Player> getAllPlayers() {
        return players;
    }

    public Player registerPlayer() {
        if (players != null && players.size() < 4) {
            Player player = new Player.PlayerBuilder(firstNameList.get(index), lastNameList.get(index)).build();
            players.add(player);
            index++;
            return player;
        }
        throw new ShelemApplicationException("All players are set. Let's play the game!");
    }

    public Map<Integer, Team> setTeammates(Set<Player> players) {
        HashMap<Integer, Team> teams = new HashMap<>();
        if (players != null && !players.isEmpty()) {
            List<Player> playersList = players.stream().collect(Collectors.toList());
            teams.put(1, new Team(playersList.get(0), playersList.get(2)));
            teams.put(2, new Team(playersList.get(1), playersList.get(3)));
            return teams;
        }

        throw new ShelemApplicationException(" There is no players for grouping!");
    }

}
