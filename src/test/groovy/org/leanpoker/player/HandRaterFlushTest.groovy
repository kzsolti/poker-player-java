package org.leanpoker.player

import com.google.gson.JsonParser
import spock.lang.Specification

/**
 * Created by fulop on 2014.03.29..
 */
class HandRaterFlushTest extends Specification {
    def "hasFlush"() {
        given:
        Hand hand = new Hand();
        hand.addCard(new Card("2", "diamonds"))
        hand.addCard(new Card("3", "diamonds"))
        hand.addCard(new Card("4", "diamonds"))
        hand.addCard(new Card("5", "diamonds"))
        hand.addCard(new Card("6", "diamonds"))
        HandRaterFlush handRaterFlush = new HandRaterFlush();
        def x = handRaterFlush.rate(hand)


        expect:
        x == HandRater.FLUSH
    }

    def "hasFlush2"() {
        given:
        Hand hand = new Hand();
        hand.addCard(new Card("2", "clubs"))
        hand.addCard(new Card("2", "diamonds"))
        hand.addCard(new Card("3", "diamonds"))
        hand.addCard(new Card("4", "diamonds"))
        hand.addCard(new Card("5", "diamonds"))
        hand.addCard(new Card("6", "diamonds"))
        HandRaterFlush handRaterFlush = new HandRaterFlush();
        def x = handRaterFlush.rate(hand)


        expect:
        x == HandRater.FLUSH
    }

    def "hasFlush3"() {
        given:
        Hand hand = new Hand();
        hand.addCard(new Card("2", "diamonds"))
        hand.addCard(new Card("2", "clubs"))
        hand.addCard(new Card("3", "diamonds"))
        hand.addCard(new Card("4", "diamonds"))
        hand.addCard(new Card("5", "diamonds"))
        hand.addCard(new Card("6", "diamonds"))
        HandRaterFlush handRaterFlush = new HandRaterFlush();
        def x = handRaterFlush.rate(hand)


        expect:
        x == HandRater.FLUSH
    }


    def "noFlush"() {
        given:
        Hand hand = new Hand();
        hand.addCard(new Card("2", "clubs"))
        hand.addCard(new Card("3", "diamonds"))
        hand.addCard(new Card("4", "diamonds"))
        hand.addCard(new Card("5", "diamonds"))
        hand.addCard(new Card("6", "diamonds"))
        HandRaterFlush handRaterFlush = new HandRaterFlush();
        def x = handRaterFlush.rate(hand)


        expect:
        x == 0
    }

}
