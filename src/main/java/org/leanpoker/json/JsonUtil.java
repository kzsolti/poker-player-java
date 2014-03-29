package org.leanpoker.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Iterator;

import org.leanpoker.player.Player;

/**
 * Created by katona.zsolt on 2014.03.29..
 */
public class JsonUtil {

	public int getSmallBlind(JsonElement gameState) {
		return getChildElement(gameState, "small_blind").getAsInt();
	}

	public JsonObject getSelf(JsonElement gameState) {
		JsonArray players = getChildElement(gameState, "players").getAsJsonArray();
		Iterator<JsonElement> iterator = players.iterator();
		while (iterator.hasNext()) {
			JsonElement player = iterator.next();
			if (Player.VERSION.equals(getChildElement(player, "version").getAsString())) {
				return player.getAsJsonObject();
			}
		}
		return null;
	}

	private JsonElement getChildElement(JsonElement jsonElement, String key) {
		return jsonElement.getAsJsonObject().get(key);
	}
}
