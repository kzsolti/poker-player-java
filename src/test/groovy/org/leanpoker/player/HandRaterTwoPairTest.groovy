package org.leanpoker.player

import spock.lang.Specification

/**
 * Created by katona.zsolt on 2014.03.29..
 */
class HandRaterTwoPairTest extends Specification {

	def "has two pairs"() {
		given:
		def hand = new Hand()
		hand.addCard(new Card('5', 'diamonds'))
		hand.addCard(new Card('5', 'spades'))
		hand.addCard(new Card('A', 'hearts'))
		hand.addCard(new Card('A', 'spades'))
		def twoPairRater = new HandRaterTwoPair()

		expect:
		twoPairRater.rate(hand) > 0
	}
}
