package org.leanpoker.player;

import com.google.gson.JsonElement;

import org.leanpoker.json.JsonUtil;

public class Player {

    public static final String VERSION = "Korda Gyuri Bacsi pokerrobotja 60e9b14";

    public static int betRequest(JsonElement request) {
		JsonUtil jsonUtil = new JsonUtil(request);
		try {
			if (Math.random() < 0.05) {
				return 0;
			} else {
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
