package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.StringSort;

class StringSortTest {

	StringSort strSort = new StringSort();
	
	@Test
	void test() {
		
	String arr[] = strSort.sort("harrypotter and the deathly hallows");	
	assertEquals("and", arr[0]);
	assertEquals("deathly", arr[1]);
	assertEquals("hallows", arr[2]);
	assertEquals("harrypotter", arr[3]);
	assertEquals("the", arr[4]);
	
	}

}
