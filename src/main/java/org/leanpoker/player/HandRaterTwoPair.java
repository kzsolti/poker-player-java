package org.leanpoker.player;

import java.util.List;
import java.util.Map;

/**
 * Created by katona.zsolt on 2014.03.29..
 */
public class HandRaterTwoPair extends HandRater {

	@Override
	public float rate(Hand hand) {
		int pairCount = 0;
		Map<String, List<Card>> rankCounts = getRankCounts(hand);
		for (Map.Entry<String, List<Card>> rankCount : rankCounts.entrySet()) {
			if (rankCount.getValue().size() == 2) {
				pairCount++;
			}
		}
		return pairCount == 2 ? TWO_PAIRS : 0;
	}
}
