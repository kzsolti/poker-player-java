package org.leanpoker.json

import com.google.gson.JsonParser
import spock.lang.Specification

/**
 * Created by katona.zsolt on 2014.03.29..
 */
class JsonUtilTest extends Specification {

	def jsonUtil
	def jsonElement

	def setup() {
		jsonUtil = new JsonUtil()
		def jsonFile = new File('src/main/resources/json_test.json')
		jsonElement = new JsonParser().parse(jsonFile.text);
	}

	def "get call amount test"() {
		expect:
		jsonUtil.getSmallBlind(jsonElement) == 10
	}

	def "get our stats"() {
		expect:
		jsonUtil.getSelf(jsonElement) != null
	}

	def "get our cards"() {
		expect:
		jsonUtil.getOurCards(jsonElement).size() == 2
	}

}
