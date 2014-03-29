package org.leanpoker.player

import spock.lang.Specification

/**
 * Created by katona.zsolt on 2014.03.29..
 */
class HandRaterFullHouseTest extends Specification {

	def "has full house"() {
		given:
		def hand = new Hand()
		hand.addCard(new Card('5', 'diamonds'))
		hand.addCard(new Card('5', 'spades'))
		hand.addCard(new Card('5', 'hearts'))
		hand.addCard(new Card('8', 'hearts'))
		hand.addCard(new Card('8', 'spades'))
		def fullHouseRater = new HandRaterFullHouse()

		expect:
		fullHouseRater.rate(hand) > 0
	}
}
