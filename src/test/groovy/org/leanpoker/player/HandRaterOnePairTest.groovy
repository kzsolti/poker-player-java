package org.leanpoker.player

import spock.lang.Specification

/**
 * Created by katona.zsolt on 2014.03.29..
 */
class HandRaterOnePairTest extends Specification {

	def "has one pair"() {
		given:
		def hand = new Hand()
		hand.addCard(new Card('5', 'diamonds'))
		hand.addCard(new Card('5', 'spades'))
		def onePairRater = new HandRaterOnePair()

		expect:
		onePairRater.rate(hand) > 0
	}
}
