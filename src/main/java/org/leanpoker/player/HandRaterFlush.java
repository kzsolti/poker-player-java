package org.leanpoker.player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fulop on 2014.03.29..
 */
public class HandRaterFlush extends HandRater {
    @Override
    public float rate(Hand hand) {
        List<Card> cards = hand.getCards();
        if (cards.size()<5) {
            return 0;
        }
        Map<String, Integer> suits = new HashMap<>();
        for (Card card : cards) {
            String suit = card.getSuit();
            Integer num = suits.get(suit);
            if (num == null) {
                suits.put(suit, new Integer(1));
            }
        }

        for (Integer numSuits : suits.values()) {
            if (numSuits >= 5) {
                return 1;
            }
        }

        return 0;
    }
}
