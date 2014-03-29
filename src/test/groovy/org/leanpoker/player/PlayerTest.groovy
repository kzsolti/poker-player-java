package org.leanpoker.player
import com.google.gson.JsonParser
import spock.lang.Specification
/**
 * Created by katona.zsolt on 2014.03.28..
 */
class PlayerTest extends Specification {

	def "betRequestTest"() {
		given:
		def jsonFile = new File('src/main/resources/json_test.json')
		def jsonElement = new JsonParser().parse(jsonFile.text);

		expect:
		Player.betRequest(jsonElement) >= 0
	}
}
