package org.leanpoker.player;

/**
 * Created by fulop on 2014.03.29..
 */
public class PlayStrategy {

    public PlayStrategy() {

    }

    public static int play(Hand hand) {
        return ruleDefault(hand);
    }

    private static int ruleDefault(Hand hand) {
        if (Math.random() < 0.05) {
            return 0;
        } else {
            return -1;
        }

    }

}
