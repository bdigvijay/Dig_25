package exceptionDemo;

import java.util.Set;
import java.util.TreeSet;

public class Example1 {

	static int intA = 45;
	static int[] intArr = {4,9,2};
	int catValue=0;
	
	void displayresult(int x, int y, int d) {
		System.out.println("-------------------Start-----------------------");
		try {
			int result = intA/x;
			System.out.println(result);
			int z = intArr[y];
			System.out.println(z);
			Set<Integer> ts = new TreeSet<Integer>();
			ts.add(5);
			ts.add(null);
			catValue = 1;
			
		} catch (ArithmeticException ae) {
			catValue = 2;
			System.out.println(ae.getMessage());
			
		} catch(IndexOutOfBoundsException ie) {
			catValue = 3;
			System.out.println(ie.getMessage());
			
		}finally {
			System.out.println("catValue : "+catValue);
			switch(catValue) {
			case 1 :
				System.out.println("try-finally-allOk");
				break;
			case 2 :
				System.out.println("try-catch1-finally-handled");
				break;
			case 3 :
				System.out.println("try-catch2-finally-handled");
				break;
			default :
				System.out.println("try-finally-terminated");
			}
		}
	}
	
	public static void main(String[] args) {
		Example1 ex1 = new Example1();
		
		ex1.displayresult(0,5,5);
		ex1.displayresult(5,5,5); 
		ex1.displayresult(2,2,5);
	}

}
