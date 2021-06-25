package com.game.shelem.card;

import com.game.shelem.player.Player;
import com.game.shelem.player.PlayerService;

import java.util.*;


public class CardService {
    private PlayerService playerService;
    private Set<Card> initCards = Collections.<Card>emptySet();

    CardService(PlayerService service) {
        this.playerService = service;
    }

    public Map<Player, Set<Card>> shuffle() {
        return null;
    }

    private void loadInitCards(Set<Card> cards) {
        this.initCards = cards;
    }

    public Set<Card> getInitCards() {
        return initCards;
    }

}
