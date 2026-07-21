package collectionFrameworkDemo.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class Example4 {
	
	public static void main(String[] args) {
		HashMap<String,String> students = new HashMap<>();
		students.put("Techno", "Credits");
		students.put("digvijay", "bhosale");
		students.put("techno", "Credits");
		students.put("digvijay", "dassault");
		
		
		int total = students.size();
		System.out.println(students.keySet());
		System.out.println(students.values());
		System.out.println(students);
		System.out.println(total);
	}

}
