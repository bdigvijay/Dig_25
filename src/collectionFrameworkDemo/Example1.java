package collectionFrameworkDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example1 {
	
	public static void main(String[] args) {
	ArrayList<Object> al = new ArrayList<Object>();
	
	al.add("digvijay");
	al.add("one");
	al.add(5);
	al.add(2);
	al.add("digvijay");
	al.add("one");
	al.add(null);
	al.add(null);
	System.out.println("Array List : " + al + "Insertion order is maintaind, duplicates are allowed");
	
	HashSet<Object> hs = new HashSet<Object>();
	
	hs.add("digvijay");
	hs.add("one");
	hs.add(5);
	hs.add(null);
	hs.add(2);
	hs.add("digvijay");
	hs.add("one"); 
	hs.add(null);
	
	System.out.println("HashSet : " + hs + "Insertion order is not maintaind, duplicates are not allowed");
	
	LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
	
	lhs.add("digvijay");
	lhs.add("one");
	lhs.add(5);
	lhs.add(2);
	lhs.add("digvijay");
	lhs.add(null);
	lhs.add("one");
	

	System.out.println("Linked Hash Set : " + lhs + "Insertion order is maintaind, duplicates are not allowed" );
	
	TreeSet<Object> ts = new TreeSet<Object>();
	
	
//	ts.add(5);
//	ts.add(2);
//	ts.add(null);
	ts.add("digvijay");
	ts.add("one");
	ts.add("digvijay");

	ts.add("one");
	

	System.out.println("TreeSet : " + ts);

	
	}
}
