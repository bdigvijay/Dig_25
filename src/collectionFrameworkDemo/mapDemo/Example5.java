package collectionFrameworkDemo.mapDemo;

import java.util.HashMap;
import java.util.Iterator;

public class Example5 {

	public static void main(String[] args) {
		HashMap<String, String> candidates = new HashMap<>();
		candidates.put("Hello", "world");
		candidates.put("techno", "credits");
		candidates.put("Techno", "credits");
		candidates.put("digvijay", "bhosale");
		candidates.put("bhosale", "bhosale");
		candidates.put("vivek", "devkar");

		//System.out.println(candidates.containsKey("techno"));
		
//		Iterator<String> itr = candidates.keySet().iterator();
//		
//		while(itr.hasNext()) {
//			String key = itr.next();
//			System.out.println(key);
//		}
		
		for(String key : candidates.keySet()) {
			System.out.println(key+"\t: "+candidates.get(key));
		}
		
	}
}
