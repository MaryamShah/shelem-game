package com.game.shelem.player;

import com.game.shelem.card.Card;
import com.game.shelem.score.Score;
import lombok.Data;

import java.util.Set;

@Data
public class Player {

    private String firstName;
    private String lastName;
    private boolean regnant = false;  //hAkem
    private boolean playing = false;
    private Set<Card> cards;
    private Score score;

    private Player(PlayerBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.cards = builder.cards;
        this.score = builder.score;
    }


    public static class PlayerBuilder {
        private String firstName;
        private String lastName;
        private boolean regnant = false;  //hAkem
        private boolean playing = false;
        private Set<Card> cards;
        private Score score;

        public PlayerBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PlayerBuilder cards(Set<Card> cards) {
            this.cards = cards;
            return this;
        }

        public PlayerBuilder score(Score score) {
            this.score = score;
            return this;
        }

        public Player build() {
            return new Player(this);
        }
    }
}

