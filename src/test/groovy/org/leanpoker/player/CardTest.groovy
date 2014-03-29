package org.leanpoker.player

import com.google.gson.JsonParser
import spock.lang.Specification

/**
 * Created by katona.zsolt on 2014.03.28..
 */
class CardTest extends Specification {

	def "createHand"() {
		given:
		def jsonElement = new JsonParser().parse('{"key1": "value1", "key2": "value2"}');
        Card card = new Card("", "");

		expect:
		card != null
	}

    def "createHandWithCard"() {
        given:
        def jsonElement = new JsonParser().parse('{"key1": "value1", "key2": "value2"}');
        Card card = new Card("8", "diamonds");

        expect:
        card.getRank() == "8";
        card.getSuit() == "diamonds"
    }

}
