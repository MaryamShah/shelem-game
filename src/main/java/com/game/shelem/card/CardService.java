package com.game.shelem.card;

import com.game.shelem.enumuration.CardType;
import com.game.shelem.player.Player;
import com.game.shelem.player.PlayerService;

import java.util.*;


public class CardService {
    private PlayerService playerService;
    private Set<Card> initCards = Collections.<Card>emptySet();
    private Set<String> ordinaryCards = new HashSet<>(Arrays.asList(
            "c2", "c3", "c4", "c6", "c7", "c8", "c9", "c11", "c12", "c13",
            "d2", "d3", "d4", "d6", "d7", "d8", "d9", "d11", "d12", "d13",
            "h2", "h3", "h4", "h6", "h7", "h8", "h9", "h11", "h12", "h13",
            "s2", "s3", "s4", "s6", "s7", "s8", "s9", "s11", "s12", "s13"));
    private Set<String> fivePointCards = new HashSet<>(Arrays.asList(" c5", "d5", "h5", "s5"));
    private Set<String> tenPointCards = new HashSet<>(Arrays.asList("c1", "c10", "d1", "d10", "h1", "h10", "s1", "s10"));


    CardService(PlayerService service) {
        this.playerService = service;
    }

    public Map<Integer, Set<Card>> shuffle() {
        return null;
    }

    private Set<Card> loadCards() {
        ordinaryCards.forEach(name -> initCards.add(new Card(name, CardType.ORDINARY)));
        fivePointCards.forEach(name -> initCards.add(new Card(name, CardType.FIVE_POINT)));
        tenPointCards.forEach(name -> initCards.add(new Card(name, CardType.TEN_POINT)));
        return initCards;
    }

}
