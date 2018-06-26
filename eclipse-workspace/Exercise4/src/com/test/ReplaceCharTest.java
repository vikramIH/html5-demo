package com.test;

import static org.junit.jupiter.api.Assertions.*;

import com.main.ReplaceChar;

import org.junit.jupiter.api.Test;

class ReplaceCharTest {

	ReplaceChar replaceChar = new ReplaceChar();
	
	@Test
	void test() {
		String changedString = replaceChar.replaceDandL("DlDldL");
		assertEquals("FtFtfT", changedString);
	}

}
