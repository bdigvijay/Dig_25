package collectionFrameworkDemo.mapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Example9 {
	public static void main(String[] args) {
		HashMap<String, String> candidates = new HashMap();
		candidates.put("techno", "credits");
		candidates.put("hello", "world");
		candidates.put("digviay", "credits");
		candidates.put("Hello", "World");
		candidates.put("Techno", "credits");
		candidates.put("digvijay", "bhosale");
		
		System.out.println(candidates);
		Collection<String> keys = candidates.keySet();
		Iterator<String> itr  = keys.iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			if(candidates.get(key).equals("credits")) {
				//candidates.remove(key);    ---------> throws ConcurrentModificationException
				itr.remove();
			}
		}
		
		System.out.println(candidates);
	}
}
