package arrayDemo;


import java.util.*;
import java.io.*;

public class Example1 {
	
	  int maxCount;
	  String longName;

	  String getMaxName(String line){

	    String[] names = line.split(" ");

	    for ( int i = 0 ; i < names.length ; i ++){

	      String name = names[i] ;
	      int count= 0;

	      for(int j = 0; j < name.length() ; j ++){
	        char ch = name.charAt(j);
	        if(Character.isLetter(ch)){
	          count = count + 1;
	        }
	      }
	      if (count > maxCount){
	        maxCount = count;
	        longName = name;
	      }
	    }

	    return longName;
	  }

	  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String line = sc.nextLine();
	    String word = new Example1().getMaxName(line);
	    System.out.println(word);
	  }

	}

