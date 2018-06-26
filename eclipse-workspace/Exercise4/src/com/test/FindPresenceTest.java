package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.FindPresence;

class FindPresenceTest {

	FindPresence find = new FindPresence();
	
	@Test
	void findHarry () {
	boolean isTrue = find.findHenry("This is Harry asd");
	assertEquals(true, isTrue);
	}
	
	@Test
	void findHenry () {
	boolean isTrue = find.findHenry("This is Henry asd");
	assertEquals(false, isTrue);
	}

}
