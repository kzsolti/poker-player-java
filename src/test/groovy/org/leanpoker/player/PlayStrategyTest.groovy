package org.leanpoker.player

import spock.lang.Specification
/**
 * Created by katona.zsolt on 2014.03.28..
 */
class PlayStrategyTest extends Specification {

	def "playStrategy"() {
		given:
        Hand hand = new Hand();
        def result = PlayStrategy.play(hand)

        expect:
        result in StrategyDecision.values()
	}



}
