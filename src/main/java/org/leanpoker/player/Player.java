package org.leanpoker.player;

import com.google.gson.JsonElement;

import org.leanpoker.json.JsonUtil;

public class Player {

    public static final String VERSION = "Korda Gyuri Bacsi pokerrobotja";

    public static int betRequest(JsonElement request) {
		JsonUtil jsonUtil = new JsonUtil(request);
        Hand currentHand = new Hand();
        currentHand.addCards(jsonUtil.getOurCards());
        currentHand.addCards(jsonUtil.getCommunityCards());

		try {
            switch (PlayStrategy.play(currentHand)) {
                case 0:
                    return 0;
                case -1:
                    return jsonUtil.getCurrentBuyIn() - jsonUtil.getOurBet();

                default:
                    return jsonUtil.getCurrentBuyIn() - jsonUtil.getOurBet();
            }

		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
			return 0;
		}
	}

    public static void showdown(JsonElement game) {
    }
}
