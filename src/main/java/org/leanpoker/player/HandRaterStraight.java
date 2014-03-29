package org.leanpoker.player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by kiss.katalin on 2014.03.29..
 */
public class HandRaterStraight extends HandRater {
    @Override
    public float rate(Hand hand) {
        List<Card> cards = hand.getCards();
        if (cards.size()<5) {
            return 0;
        }
        Map<String, Integer> suits = new HashMap<>();
        List<Card> sortedList = new ArrayList<>();
        for (Card card : cards) {
            sortedList =  addCardToList(sortedList, card);
        }

       if (1==1) {
           return 0;
       }

        for (Integer numSuits : suits.values()) {
            if (numSuits >= 5) {
                return 0;
            }
        }

        return 0;
    }

    private List<Card> addCardToList(List<Card> sortedList, Card newCard) {
        if (sortedList == null) {
            sortedList = new ArrayList<>();
        }

        if (sortedList.size()==0) {
            sortedList.add(newCard);
            return  sortedList;
        }

        List<Card> retList = new ArrayList<>();
        for (Card card : sortedList) {
            if (newCard.getRankInt()<card.getRankInt()) {
                retList.add(newCard);
            } else {
                retList.add(card);
            }
        }

        return sortedList;
    }
}
