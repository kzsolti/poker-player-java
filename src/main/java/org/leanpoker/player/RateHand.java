package org.leanpoker.player;

import java.util.List;

/**
 * Created by fulop on 2014.03.29..
 */
public class RateHand {



    public static float rateHand(Hand hand) {
        return 1;
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
