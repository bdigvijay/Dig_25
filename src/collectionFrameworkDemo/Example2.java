package collectionFrameworkDemo;

import java.util.HashSet;
import java.util.Iterator;

public class Example2 {
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();
		
		hs.add("digvijay");
		hs.add("one");
		hs.add("five");
		hs.add("two");
		hs.add("digvijay");
		hs.add("one"); 
		//hs.add(null);
		
		System.out.println(hs);
		Iterator<Object> itr = hs.iterator();
		while(itr.hasNext()) {
			String value = itr.next().toString();
			System.out.println(value);
		}
	}
}
