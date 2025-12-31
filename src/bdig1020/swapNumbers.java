package bdig1020;

import java.util.Scanner;

public class swapNumbers {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter x :");
			int x = sc.nextInt();
			System.out.println("Enter y :");
			int y = sc.nextInt();
			System.out.println("old x is " + x + ", old y is " + y);
			x = x + y;
			y = x - y;
			x = x - y;
			System.out.println("New x is " + x + ", new y is " + y);
		}
	}
	
	
}
