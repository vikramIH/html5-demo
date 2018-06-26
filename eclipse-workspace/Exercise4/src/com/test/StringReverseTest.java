package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.StringReverse;

class StringReverseTest {

	StringReverse stringReverse = new StringReverse();
	
	@Test
	void reverseTest() {
		String reversedString = stringReverse.reverseWords("Stack route and Boeing");
		assertEquals("kcatS etuor dna gnieoB", reversedString);
	}

}
