package org.leanpoker.player;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by fulop on 2014.03.29..
 */
public class RateHand {

    private static List<HandRater> raters = new LinkedList<HandRater>();

    public static float rateHand(Hand hand) {
        List<Card> cards = hand.getCards();
        int numRank = 0;
        for (Card card : cards) {
              numRank += card.getRankInt();
        }

        float raterRank = 0;

        for (HandRater rater : raters) {
            float thisRank = rater.rate(hand);
            if (raterRank < thisRank) {
                raterRank = thisRank;
            }
        }
        return numRank + raterRank;
    }

    public static Rating rate(List<Card> ourCards, List<Card> communityCards) {
        Hand ourHand = new Hand();
        ourHand.addCards(ourCards);

        Hand communityHand = new Hand();
        communityHand.addCards(communityCards);

        Hand fullHand = new Hand();
        fullHand.addCards(ourCards);
        fullHand.addCards(communityCards);

        float ourRate = rateHand(ourHand);
        float communityRate = rateHand(communityHand);
        float fullRate = rateHand(fullHand);



        return new Rating(fullRate/communityRate,   ourRate / communityRate);
    }

    public static void registerRater(HandRater handRater) {
        raters.add(handRater);
    }
}
