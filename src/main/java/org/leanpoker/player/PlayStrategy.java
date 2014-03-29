package org.leanpoker.player;

/**
 * Created by fulop on 2014.03.29..
 */
public class PlayStrategy {

    public PlayStrategy() {

    }

    public static StrategyDecision play(Rating rating) {
//        return ruleDefault();
		return ruleByRating(rating);
    }

    private static StrategyDecision ruleDefault() {

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

	private static StrategyDecision ruleByRating(Rating rating) {
		if (rating.getFullToDeskRatio() > 1) {
			return StrategyDecision.RAISE_BIG;
		} else if (rating.getHoleToDeskRatio() > 1) {
			return StrategyDecision.RAISE;
		} else if (rating.getHoleToDeskRatio() < 0.5 && rating.getFullToDeskRatio() < 0.5) {
			return StrategyDecision.FOLD;
		} else {
			return StrategyDecision.CALL_BET;
		}
	}

}
