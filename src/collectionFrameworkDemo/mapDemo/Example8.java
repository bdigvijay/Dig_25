package collectionFrameworkDemo.mapDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Example8 {
	public static void main(String[] args) {
		HashMap<String, String> candidates = new HashMap();
		candidates.put("techno", "credits");
		candidates.put("hello", "world");
		candidates.put("digviay", "credits");
		candidates.put("Hello", "World");
		candidates.put("Techno", "credits");
		candidates.put("digvijay", "bhosale");

		System.out.println(candidates);
		
		Set<String> remKey = new HashSet<String>();
		Set<String> keys = candidates.keySet();
		for (String key : keys) {
			String val = candidates.get(key);
			if (val.equals("credits")) {
				remKey.add(key);
				//candidates.remove(key);
			}
		}

		for (String rk : remKey) {
			candidates.remove(rk);
		}
		
		System.out.println(candidates);
	}
}
