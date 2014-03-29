package org.leanpoker.player

import com.google.gson.JsonParser
import spock.lang.Specification

/**
 * Created by katona.zsolt on 2014.03.28..
 */
class RateHandTest extends Specification {

	def "ratePair"() {
        given:
        Card card1 = new Card("9", "diamonds");
        Card card2 = new Card("9", "spades");
        Hand hand = new Hand()

        expect:
		hand != null
	}

}
