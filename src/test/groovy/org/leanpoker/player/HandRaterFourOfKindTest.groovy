package org.leanpoker.player

import spock.lang.Specification

/**
 * Created by katona.zsolt on 2014.03.29..
 */
class HandRaterFourOfKindTest extends Specification {

	def "has three of a kind"() {
		given:
		def hand = new Hand()
		hand.addCard(new Card('5', 'diamonds'))
		hand.addCard(new Card('5', 'spades'))
		hand.addCard(new Card('5', 'hearts'))
		hand.addCard(new Card('5', 'clubs'))
		def fourOfKindRater = new HandRaterFourOfKind()

		expect:
		fourOfKindRater.rate(hand) > 0
	}
}
