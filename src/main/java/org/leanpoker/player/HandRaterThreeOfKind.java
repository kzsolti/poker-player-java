package org.leanpoker.player;

import java.util.List;
import java.util.Map;

/**
 * Created by katona.zsolt on 2014.03.29..
 */
public class HandRaterThreeOfKind extends HandRater {

	@Override
	public float rate(Hand hand) {
		Map<String, List<Card>> rankCounts = getRankCounts(hand);
		for (Map.Entry<String, List<Card>> rankCount : rankCounts.entrySet()) {
			if (rankCount.getValue().size() == 3) {
				return THREE_OF_A_KIND;
			}
		}
		return 0;
	}
}
