package com.main;

import java.util.Arrays;

public class StringSort {

	public String[] sort ( String str ) {
		
		
		String[] strArray = str.split("\\s"); 
	   Arrays.sort(strArray);
	    return strArray;  
	}
	
}
