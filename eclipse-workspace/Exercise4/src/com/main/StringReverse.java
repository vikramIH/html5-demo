package com.main;

public class StringReverse {

	public String reverseWords ( String str ) {
		
		String[] strArray = str.split(" ");
		String reverse;
		int len;
		
		for  ( int i = 0; i < strArray.length; i++ ) {
			len = strArray[i].length();
			reverse = "";
			for ( int j = 0; j < len; j++ ) {
				reverse = reverse.concat(strArray[i].charAt(len-j-1) + "");
			}
			strArray[i] = reverse;
		}
		
		reverse = "";
		
		for( int i = 0; i < strArray.length; i++ )	{ 
			reverse = reverse.concat(strArray[i]).concat(" "); 
		}
		
		return reverse.trim();
		
	}
	
}
