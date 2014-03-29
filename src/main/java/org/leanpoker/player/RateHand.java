package org.leanpoker.player;

import java.util.List;

/**
 * Created by fulop on 2014.03.29..
 */
public class RateHand {



    public static int rate(Hand ourHand, Hand communityHand) {
        return 1;
    }

    public static Rating rate(List<Card> ourCards, List<Card> communityCards) {
        return new Rating(1, 1);
    }
}
