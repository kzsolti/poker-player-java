package org.leanpoker.player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fulop on 2014.03.29..
 */
public class Hand {

    List<Card> cards = new ArrayList<Card>();

    public Hand addCard(Card card) {
        this.cards.add(card);
        return this;
    }

    public List<Card> getCards() {
        return cards;
    }

}
