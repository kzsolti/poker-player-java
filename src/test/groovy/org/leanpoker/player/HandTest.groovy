package org.leanpoker.player

import com.google.gson.JsonParser
import spock.lang.Specification

/**
 * Created by katona.zsolt on 2014.03.28..
 */
class HandTest extends Specification {

	def "createHand"() {
		given:
		def jsonElement = new JsonParser().parse('{"key1": "value1", "key2": "value2"}');

		expect:
		Hand.addCard(jsonElement) == 0
	}
}
