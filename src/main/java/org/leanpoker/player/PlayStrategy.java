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
        if (Math.random() < 0.05) {
            return StrategyDecision.FOLD;
        } else {
            return StrategyDecision.CALL_BET;
        }

    }

}
