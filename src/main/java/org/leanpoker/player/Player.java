package org.leanpoker.player;

import com.google.gson.JsonElement;

import org.leanpoker.json.JsonUtil;

public class Player {

    public static final String VERSION = "Korda Gyuri Bacsi pokerrobotja 60e9b14";

    public static int betRequest(JsonElement request) {
		JsonUtil jsonUtil = new JsonUtil(request);
        Hand currentHand = new Hand();
        currentHand.addCards(jsonUtil.getOurCards());
        currentHand.addCards(jsonUtil.getCommunityCards());
        Rating rating = RateHand.rate(jsonUtil.getOurCards(), jsonUtil.getCommunityCards());

		try {
            switch (PlayStrategy.play(currentHand)) {
                case FOLD:
                    return 0;
                case CALL_BET:
                    return getMinimumBetAmount(jsonUtil);
				case RAISE_SMALL:
					return getMinimumBetAmount(jsonUtil) + jsonUtil.getMinimumRaise();
				case RAISE:
					return getMinimumBetAmount(jsonUtil) + jsonUtil.getMinimumRaise() * 2;
				case RAISE_BIG:
					return getMinimumBetAmount(jsonUtil) + jsonUtil.getMinimumRaise() * 3;
				case ALL_IN:
					return jsonUtil.getOurStack();
                default:
                    return getMinimumBetAmount(jsonUtil);
            }

		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			return 0;
		}
	}

	private static int getMinimumBetAmount(JsonUtil jsonUtil) {
		return jsonUtil.getCurrentBuyIn() - jsonUtil.getOurBet();
	}

    public static void showdown(JsonElement game) {
    }
}
