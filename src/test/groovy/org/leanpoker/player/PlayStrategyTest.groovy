package org.leanpoker.player

import com.google.gson.JsonParser
import spock.lang.Specification

/**
 * Created by katona.zsolt on 2014.03.28..
 */
class PlayStrategyTest extends Specification {

	def "playStrategy"() {
		given:
        Hand hand = new Hand();
        int result = PlayStrategy.play(hand)

        expect:
        result == -1
	}



}
