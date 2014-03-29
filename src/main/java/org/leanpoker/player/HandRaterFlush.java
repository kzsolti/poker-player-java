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
            addSuiteToMap(suits, card.getSuit() );
                     }

        for (Integer numSuits : suits.values()) {
            if (numSuits >= 5) {
                return HandRater.FLUSH;
            }
        }

        return 0;
    }

    public void addSuiteToMap(Map<String, Integer> suits, String suit) {
        Integer num = suits.get(suit);
        if (num == null) {
            suits.put(suit, new Integer(1));
        } else {
            System.out.println(num);
            num = new Integer(num.intValue() + 1);
            System.out.println(num);
            suits.put(suit, num);
        }

    }
}
