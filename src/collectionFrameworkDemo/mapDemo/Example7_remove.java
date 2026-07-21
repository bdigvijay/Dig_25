package collectionFrameworkDemo.mapDemo;

import java.util.HashMap;
import java.util.Iterator;

public class Example7_remove {

	public static void main(String[] args) {
		HashMap<String, String> candidates = new HashMap<>();
		candidates.put("Hello", "world");
		candidates.put("techno", "credits");
		candidates.put("Techno", "credits");
		candidates.put("digvijay", "bhosale");
		candidates.put("bhosale", "bhosale");
		candidates.put("vivek", "devkar");

		
		System.out.println(candidates);
		System.out.println(candidates.remove("shirur"));
		System.out.println(candidates);
		System.out.println(candidates.remove("shirefur"));
		System.out.println(candidates.remove("Techno","pune"));
		System.out.println(candidates.remove("Techno","credits"));
		System.out.println(candidates);
		
	}
}
