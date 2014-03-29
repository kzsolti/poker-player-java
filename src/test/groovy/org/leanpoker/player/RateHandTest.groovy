package org.leanpoker.player

import com.google.gson.JsonParser
import spock.lang.Specification

/**
 * Created by katona.zsolt on 2014.03.28..
 */
class RateHandTest extends Specification {

	def "rateHand"() {
        given:
        Card card1 = new Card("9", "diamonds");
        Card card2 = new Card("9", "spades");
        Hand hand = new Hand()
        hand.addCard(card1)
        hand.addCard(card2)
        int rate = RateHand.rateHand(hand)

        expect:
		true
	}

}
