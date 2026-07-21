package aAAssignments;

import java.util.HashMap;

/* 	Count the freq of each character from given String.
	String str = "aakanksha"*/

public class Assignment81 {
	public static void main(String[] args) {

		HashMap<Character, Integer> charFreq = new HashMap<Character, Integer>();
		String str = "aakannnnnshha";
		char[] strArr = str.toCharArray();

		for (char ch : strArr) {
			if(charFreq.containsKey(ch)) {
				int count =1 + charFreq.get(ch);
				charFreq.put(ch, count);
			} else {
				charFreq.put(ch, 1);
			}
		}
		System.out.println(charFreq);
		
		
		
		
		
		
	}
}
