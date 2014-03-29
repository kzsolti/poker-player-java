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
		def jsonFile = new File('src/main/resources/json_test.json')
		def jsonElement = new JsonParser().parse(jsonFile.text);

		expect:
		util.getSmallBlind(jsonElement) == 10
	}
}
