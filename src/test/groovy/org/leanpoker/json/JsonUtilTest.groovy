package org.leanpoker.json

import com.google.gson.JsonParser
import org.leanpoker.player.Card
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

	def "get current buy in test"() {
		expect:
		jsonUtil.getCurrentBuyIn(jsonElement) == 20
	}

	def "get our stats"() {
		expect:
		jsonUtil.getSelf(jsonElement) != null
	}

	def "get our cards"() {
		expect:
		jsonUtil.getOurCards(jsonElement).size() == 2
	}

	def "our card's contents"() {
		given:
		def cards = jsonUtil.getOurCards(jsonElement)

		expect:
		new Card(rank, suit) in cards

		where:
		rank | suit
		'9'  | 'diamonds'
		'5'  | 'hearts'
	}

	def "community card's contents"() {
		given:
		def cards = jsonUtil.getCommunityCards(jsonElement)

		expect:
		new Card(rank, suit) in cards

		where:
		rank | suit
		'8'  | 'diamonds'
		'3'  | 'clubs'
		'K'  | 'spades'
	}

	def "get our bet"() {
		expect:
		jsonUtil.getOurBet(jsonElement) == 10
	}

}
