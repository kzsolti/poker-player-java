package org.leanpoker.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import org.leanpoker.player.Card;
import org.leanpoker.player.Player;

/**
 * Created by katona.zsolt on 2014.03.29..
 */
public class JsonUtil {

	public int getSmallBlind(JsonElement gameState) {
		return getInt(gameState, "small_blind");
	}

	public int getCurrentBuyIn(JsonElement gameState) {
		return getInt(gameState, "current_buy_in");
	}

	public JsonObject getSelf(JsonElement gameState) {
		JsonArray players = getChildElement(gameState, "players").getAsJsonArray();
		for (JsonElement player : players) {
			if (Player.VERSION.equals(getString(player, "version"))) {
				return player.getAsJsonObject();
			}
		}
		return null;
	}

	public List<Card> getOurCards(JsonElement gameState) {
		List<Card> cards = new ArrayList<>();
		JsonObject self = getSelf(gameState);
		JsonArray holeCards = getChildElement(self, "hole_cards").getAsJsonArray();
		for (JsonElement jsonCard : holeCards) {
			cards.add(new Card(getString(jsonCard, "rank"), getString(jsonCard, "suit")));
		}
		return cards;
	}

	private JsonElement getChildElement(JsonElement jsonElement, String key) {
		return jsonElement.getAsJsonObject().get(key);
	}

	private String getString(JsonElement jsonElement, String key) {
		return getChildElement(jsonElement, key).getAsString();
	}

	private int getInt(JsonElement jsonElement, String key) {
		return getChildElement(jsonElement, key).getAsInt();
	}
}
