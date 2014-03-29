package org.leanpoker.player;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by fulop on 2014.03.29..
 */
public class RateHand {

    private static List<HandRater> raters = new LinkedList<HandRater>();

	static {
		raters.add(new HandRaterFlush());
		raters.add(new HandRaterStraight());
		raters.add(new HandRaterOnePair());
		raters.add(new HandRaterThreeOfKind());
		raters.add(new HandRaterTwoPair());
		raters.add(new HandRaterFullHouse());
		raters.add(new HandRaterFourOfKind());
	}

    public static float rateHand(Hand hand) {
        List<Card> cards = hand.getCards();

        if (hand == null || hand.getCards().isEmpty()) {
            return 1;
        }


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

}
