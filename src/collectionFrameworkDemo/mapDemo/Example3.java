package collectionFrameworkDemo.mapDemo;

import java.util.HashMap;

public class Example3 {
	public static void main(String[] args) {
		HashMap<Integer, String> mapOfStudents = new HashMap();
		System.out.println("returns : "+mapOfStudents.put(2, "Hi"));
		System.out.println(mapOfStudents.put(3,"Hello"));
		System.out.println(mapOfStudents.put(2,"World"));
//		System.out.println(mapOfStudents.toString());
		System.out.println(mapOfStudents);
	}
}
