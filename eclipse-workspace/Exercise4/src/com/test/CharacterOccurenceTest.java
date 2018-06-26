package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.CharacterOccurence;

class CharacterOccurenceTest {

	CharacterOccurence charOccur = new CharacterOccurence();
	
	@Test
	void occurenceTest() {
		int count = charOccur.countOccurences("Javajava", 'a');
		assertEquals(4,count);
	}
	
	@Test
	void occurenceTest2() {
		int count = charOccur.countOccurences("AxAxa@Aa", 'a');
		assertEquals(5,count);
	}

}
