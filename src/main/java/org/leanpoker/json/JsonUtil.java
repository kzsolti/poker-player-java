package org.leanpoker.json;

import com.google.gson.JsonElement;

/**
 * Created by katona.zsolt on 2014.03.29..
 */
public class JsonUtil {

	public int getSmallBlind(JsonElement gameState) {
		return gameState.getAsJsonObject().get("small_blind").getAsInt();
	}
}
