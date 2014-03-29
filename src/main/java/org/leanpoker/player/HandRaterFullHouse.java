package org.leanpoker.player;

import java.util.List;
import java.util.Map;

/**
 * Created by katona.zsolt on 2014.03.29..
 */
public class HandRaterFullHouse extends HandRater {

	@Override
	public float rate(Hand hand) {
		boolean pairFound = false, tripleFound = false;
		Map<String, List<Card>> rankCounts = getRankCounts(hand);
		for (Map.Entry<String, List<Card>> rankCount : rankCounts.entrySet()) {
			switch (rankCount.getValue().size()) {
				case 2:
					pairFound = true;
					break;
				case 3:
					tripleFound = true;
					break;
				default:
					break;
			}
		}
		return pairFound && tripleFound ? FULL_HOUSE : 0;
	}
}
