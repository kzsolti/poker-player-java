package org.leanpoker.player;

import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "Korda Gyuri Bácsi pókerrobotja";

    public static int betRequest(JsonElement request) {
		try {
			if (Math.random() < 0.1) {
				return 0;
			} else {
				return 1;
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
