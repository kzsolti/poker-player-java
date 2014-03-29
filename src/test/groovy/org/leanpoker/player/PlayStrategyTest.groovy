package org.leanpoker.player

import spock.lang.Specification
/**
 * Created by katona.zsolt on 2014.03.28..
 */
class PlayStrategyTest extends Specification {

	def "playStrategy"() {
		given:
		def rating = new Rating(1, 1)
        def result = PlayStrategy.play(rating)

        expect:
        result in StrategyDecision.values()
	}




}
