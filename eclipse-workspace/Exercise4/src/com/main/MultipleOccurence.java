package com.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurence {

	public String findIndexes ( String str1 , String str2 ) {
		
		Pattern p = Pattern.compile( str2 );
		Matcher m = p.matcher(str1);
		
        String found = "";	
		while( m.find() ) {
			
			found = found.concat( Integer.toString(m.start()) + "-").concat( Integer.toString(m.end()) + " ");
		}
		
		return found.trim();
		
	}
	
}
