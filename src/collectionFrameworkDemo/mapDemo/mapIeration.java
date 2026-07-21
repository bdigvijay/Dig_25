package collectionFrameworkDemo.mapDemo;

import java.util.HashMap;
import java.util.Iterator;

public class mapIeration {

	public static void main(String[] args) {
		HashMap<String, String> candidates = new HashMap<>();
		candidates.put("Hello", "world");
		candidates.put("techno", "credits");
		candidates.put("Techno", "credits");
		candidates.put("digvijay", "pune");
		candidates.put("shirur", "pune");
		candidates.put("vivek", "devkar");


		
		
		String[] strArr = { "digvijay", "hello", "bhosale", "techno","credits" };
		
		System.out.println("---Key check ----");
		for (String strK : strArr) {
			if (candidates.containsKey(strK)) {
				System.out.println(strK + "\t:\t" + candidates.get(strK));
			} else {
				System.out.println(strK + "\t:\t" + candidates.containsKey(strK));
			}
		}
		
		System.out.println("----value check -----");
		for (String strV : strArr) {
			System.out.println(strV+"\t:\t"+candidates.containsValue(strV));
		}
		
		


	}
}
