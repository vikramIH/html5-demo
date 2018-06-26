package com.main;
import java.util.ArrayList;
import java.util.HashMap;
public class LongestSubstringFinder {
	
    public String longestSubstring(String string) {
    HashMap<Character,Integer> map = new HashMap<>();       
    ArrayList<String> subString = new ArrayList<>();
    String temp="";
    for(int i=0;i<string.length();i++) {
        map.clear();
        temp="";
        
        for(int j=i;j<string.length();j++) {
            char ch=string.charAt(j);
            if(map.containsKey(ch)) { 
                map.put(ch, map.get(ch)+1); 
            }else {
                map.put(ch, 1);
            }
            if(map.size()>2) break;
            
            temp=temp+ch;
        }
        subString.add(temp);
    }
    return getLargestString(subString);
    
}
    private String getLargestString(ArrayList<String> strings) {
        String largestString = "";
        for(String str: strings) {
            if(str.length()>largestString.length())
                largestString = str;
        }
        return largestString;
    }
    
}
