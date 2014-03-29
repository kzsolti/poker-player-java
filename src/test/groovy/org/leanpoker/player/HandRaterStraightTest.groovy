package org.leanpoker.player

import spock.lang.Specification

/**
 * Created by kiss.katalin on 2014.03.29..
 */
class HandRaterStraightTest extends Specification {
    def "pairzero"() {
        given:
        def hand = new Hand()
        hand.addCard(new Card('5', 'diamonds'))
        hand.addCard(new Card('5', 'spades'))
        def handRaterStraight = new HandRaterStraight()

        expect:
        handRaterStraight.rate(hand) == 0
    }

    def "toosmallzero" () {
        given:
        def hand = new Hand();
        hand.addCard(new Card('2','diamonds'))
        hand.addCard(new Card('3','spades'))
        hand.addCard(new Card('4','spades'))
        def handRaterStraight = new HandRaterStraight()

        expect:
        handRaterStraight.rate(hand) == 0
    }

    def "straightok" () {
        given:
        def hand = new Hand();
        hand.addCard(new Card('2','diamonds'))
        hand.addCard(new Card('3','spades'))
        hand.addCard(new Card('4','spades'))
        hand.addCard(new Card('5','spades'))
        hand.addCard(new Card('6','spades'))
        def handRaterStraight = new HandRaterStraight()

        expect:
        handRaterStraight.rate(hand) == HandRater.STRAIGHT
    }




}
