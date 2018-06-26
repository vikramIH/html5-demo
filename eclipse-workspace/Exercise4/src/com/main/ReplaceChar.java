package com.main;

public class ReplaceChar {

	public String replaceDandL (String str) {
		
		str = str.replace('d', 'f');
		str = str.replace('D', 'F');
		str = str.replace('L', 'T');
		return str.replace('l', 't');
	}
	
}
