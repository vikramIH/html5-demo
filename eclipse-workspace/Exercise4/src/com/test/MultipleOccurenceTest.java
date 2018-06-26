package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.MultipleOccurence;

class MultipleOccurenceTest {

	MultipleOccurence occurence = new MultipleOccurence();
	
	@Test
	void test() {
		
	String indexes = occurence.findIndexes("She sells seashells by the sea shore", "se");
	assertEquals("4-6 10-12 27-29",indexes);
		
	}

}
