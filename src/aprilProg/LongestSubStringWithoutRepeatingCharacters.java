package aprilProg;

// asdasdfasdfgasdfghad

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

class LongestSubStringWithoutRepeatingCharacters {

	String longSubString = "";
	List<String> al = new ArrayList<String>();

	List<String> subString(String input) {
		System.out.println(input);
		String subString = "";
		Set<Character> chSet = new HashSet<Character>();
		char[] chAr = input.toCharArray();

		for (char ch : chAr) {
			if (chSet.add(ch)) {
				subString = subString + ch;
			} else {
				al.add(subString);
				subString = "" + ch;
				chSet.clear();
				chSet.add(ch);
			}
		}
		al.add(subString);
		System.out.println(al);
		return al;
	}

	String longestSubString(List<String> al) {
		int maxCount = 0;
		String longSubString = "";
		for (String str : al) {
			if (str.length() > maxCount) {
				longSubString = str;
			}
		}

		return longSubString;
	}

	public static void main(String[] args) {
		LongestSubStringWithoutRepeatingCharacters ex1 = new LongestSubStringWithoutRepeatingCharacters();
		List<String> ls = ex1.subString("asdasdfadasdfhgasdfghj");
		//System.out.println(ex1.longestSubString(ls));

	}
}