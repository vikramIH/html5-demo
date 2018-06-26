package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.LongestSubstringFinder;

class LongestSubstringFinderTest {

	LongestSubstringFinder longSub = new LongestSubstringFinder();
	
	@Test
	void test() {
		
		String res = longSub.longestSubstring("aabbccabababaaaabababacbabccbcbcb");
		assertEquals("abababaaaabababa",res);
	}

}
