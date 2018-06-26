package com.main;

public class CharacterOccurence {

	public int countOccurences ( String str, char ch ) {
		
		str = str.toLowerCase();            
		return str.length() - str.replaceAll(String.valueOf(ch), "").length();
	}
	
	
}
