package org.leanpoker.json

import com.google.gson.JsonParser
import spock.lang.Specification

/**
 * Created by katona.zsolt on 2014.03.29..
 */
class JsonUtilTest extends Specification {

	def "get call amount test"() {
		given:
		def util = new JsonUtil()
		def jsonElement = new JsonParser().parse('{"call": "10"}');

		expect:
		util.getCallAmount(jsonElement) == 10
	}
}
