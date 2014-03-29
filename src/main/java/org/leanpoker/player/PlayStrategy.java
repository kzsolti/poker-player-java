package org.leanpoker.player;

/**
 * Created by fulop on 2014.03.29..
 */
public class PlayStrategy {

    public PlayStrategy() {

    }

    public static StrategyDecision play(Hand hand) {
        return ruleDefault(hand);
    }

    private static StrategyDecision ruleDefault(Hand hand) {

        double randomDecision = Math.random();
        if (randomDecision < 0.05) {
            return StrategyDecision.FOLD;
        } else if (randomDecision < 0.5) {
            return StrategyDecision.RAISE_SMALL;
        } else if (randomDecision < 0.7) {
            return StrategyDecision.RAISE_BIG;
        } else {
            return StrategyDecision.CALL_BET;
        }

    }

}
