package com.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPresence {

	public boolean findHenry ( String str ) {
		
		Pattern pattern = Pattern.compile("Harry");
		Matcher matcher = pattern.matcher(str);
		return matcher.find();
	}
	
}
